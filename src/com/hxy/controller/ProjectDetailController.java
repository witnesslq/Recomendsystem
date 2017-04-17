package com.hxy.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
@RequestMapping("/project_detail")
public class ProjectDetailController {
	
	@RequestMapping(method=GET)
	public String index() {
		return "project_detail";
	}
}
