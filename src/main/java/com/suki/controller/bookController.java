package com.suki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class bookController {
	@RequestMapping(value="/index", method=RequestMethod.GET)
	
	public String book(Model model){
		
		return "index";
	}
}
