package com.hxy.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hxy.model.Person;
@Controller
@RequestMapping("/index")
public class IndexController {
	
	@RequestMapping(method=GET)
	public String index(Model model) {
		
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("项目名称",5000));
		list.add(new Person("WEB项目",85000));
		list.add(new Person("移动游戏开发",7000));
		
		model.addAttribute("list",list);
		
		return "index";
	}
	
	
	@RequestMapping(value="/2",method=GET)
	public String UserInfo(
			@RequestParam(value="user", defaultValue="huxiaoyu") String user,
			@RequestParam(value="password", defaultValue="921126") String password,
			Model model ) {
		model.addAttribute("user",user);
		model.addAttribute("password",password);
		return "forward:/homepage";
	}
	
	
}
