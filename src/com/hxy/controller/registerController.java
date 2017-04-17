package com.hxy.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.PropertiesEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.hxy.exception.NotFoundException;
import com.hxy.model.Person;
import com.hxy.service.PersonServiceImp;

@Controller
@RequestMapping("/register")
public class registerController {
	
	
	private PersonServiceImp personServiceImp; 
	@Autowired 
	public void setPersonService(PersonServiceImp personServiceImp) {
		this.personServiceImp = personServiceImp;
	}
	
	
	@InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
        binder.registerCustomEditor(int.class,new IntegerEditor());
    }
	
	public class IntegerEditor extends PropertiesEditor {  
	    @Override  
	    public void setAsText(String text) throws IllegalArgumentException {  
	        if (text == null || text.equals("")) {  
	            text = "0";  
	        }  
	        setValue(Integer.parseInt(text));  
	    }  
	  
	    @Override  
	    public String getAsText() {  
	        return getValue().toString();  
	    }  
	} 
	
	
	@RequestMapping(method=GET)
	public String registerGet(Model model) {
		model.addAttribute("person",new Person());
		return "register";
	}
	
	@RequestMapping(method=POST) 
	public String registerPost(
		@RequestParam("profilePicture") MultipartFile profilePicture,
		HttpServletRequest request,
		RedirectAttributes model,
		@Valid @ModelAttribute("person") Person person,
		BindingResult personValidateResult
		) throws IllegalStateException, IOException{
		
		if(personValidateResult.getErrorCount() > 0){  
            System.out.println("Error");  
            for(FieldError fieldError:personValidateResult.getFieldErrors()){  
                System.out.println(fieldError.getField() + ":" + fieldError.getDefaultMessage());  
                return "register";  
            } 
		}
		System.out.println(person.toString());
		if(!profilePicture.isEmpty()) {
			 String path = request.getSession().getServletContext().getRealPath("profilePicture");
		     String fileName = profilePicture.getOriginalFilename(); 
		     File targetFile = new File(path,fileName);
		     System.out.println(path);
		     if(!targetFile.exists()) {
		    	 targetFile.mkdirs();
		     }
			 profilePicture.transferTo(targetFile);
			 model.addFlashAttribute("img_url","profilePicture/"+fileName);
		} else {
			throw new NotFoundException();
		}
		
		model.addFlashAttribute("person",person);
		personServiceImp.save(person);
		return "redirect:index";
	}
}
