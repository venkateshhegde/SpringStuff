package com.in28mins.springboot.web.springbootwebapp.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	public boolean validate(String user, String pass) {
		return (user.equals("in28Minutes") && pass.equals("dummy"));

	}

}
