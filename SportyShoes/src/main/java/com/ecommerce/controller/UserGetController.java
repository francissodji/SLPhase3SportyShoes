package com.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/userpostcontroller")
public class UserGetController {

	@RequestMapping(value ="/login",method = RequestMethod.GET)
	 
	public String login() {
		return "login";
	}
	
	
	@RequestMapping(value ="/register",method = RequestMethod.GET)
	 
	public String register() {
		return "register";
	}
	
	@RequestMapping(value ="/changepassword",method = RequestMethod.GET)
	 
	public String changepassword() {
		return "changepassword";
	}
	
}
