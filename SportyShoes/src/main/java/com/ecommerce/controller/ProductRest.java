package com.ecommerce.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;


@Controller
@RequestMapping("/productmain")
public class ProductRest {

	@RequestMapping(value ="/AddProduct",method = RequestMethod.GET)
	 
	public String saveProduct() {
		
		return "RedirectView";
	}
	
	

}
