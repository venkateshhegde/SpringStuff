package com.in28mins.springboot.web.springbootwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@RequestMapping("/login")
	public String  loginMessage(@RequestParam  String name1, ModelMap model )
	{
		System.out.println(name1);
		model.put("NAME", name1);
		return "login";
	}

}
