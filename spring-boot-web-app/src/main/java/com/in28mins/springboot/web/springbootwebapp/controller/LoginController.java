package com.in28mins.springboot.web.springbootwebapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.in28mins.springboot.web.springbootwebapp.service.LoginService;


@Controller
public class LoginController {
	
	
	@Autowired 
	LoginService loginService;
	
	
	@RequestMapping(value="/login", method= RequestMethod.POST)
	public String  loginMessage1( ModelMap model, @RequestParam String name, @RequestParam String password )
	{
//		System.out.println(name);
//		model.put("NAME", name);
		model.put("NAME", name);
		model.put("PASSWORD", password);
		if (loginService.validate(name, password))
		{
			System.out.println("GOOD !!!! " + name + " "+   password);
			model.put("good", "GOOD!");
			return "login";	
		}


		System.out.println("FAILED!!!! " + name + " "+   password);
		model.put("error", "bad user / pass");
		return "login";
	}

	@RequestMapping(value="/login", method= RequestMethod.GET)
	public String  loginMessage( ModelMap model)
	{
//		System.out.println(name);
		return "welcome";
	}
}
