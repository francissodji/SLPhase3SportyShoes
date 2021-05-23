package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Users;
import com.ecommerce.service.UsersService;

@RestController
@RequestMapping("/userpostcontroller")
public class UserPostController {

	@Autowired
	private UsersService usersService;

	@PostMapping("/login")
	public String loginvalid(@RequestParam("aUsername") String name, @RequestParam("aPassword") String pass) {

		if (usersService.loginValid(name, pass)) {
			return "Login Successfull";
		}
		return "login Failed";
	}
	
	
	@PostMapping("/register")
	public String registerUser(@RequestParam("aUserFname") String uFirstName, @RequestParam("aUserLname") String uLastName, 
			@RequestParam("aUsername") String uUserName, @RequestParam("aPassword") String uUserPword) {

		Users aUser = new Users(uFirstName, uLastName, uUserName, uUserPword, false);
		usersService.addUser(aUser);

		return "user registered";
	}

	/*
	@GetMapping("/loadusers")
	public List<Users> loadAll() {
		return service.loadUsers();
		
	}
	*/

	@PostMapping("/changepassword")
	public String changeUserPassword(@RequestParam("aUsername") String uUserName, @RequestParam("aPassword") String uUserPword)
	{
		String returnmessage;
		int isChange = usersService.ChangePassword(uUserName, uUserPword);
		if(isChange > 0)
			returnmessage = "password changed";
		else
			returnmessage = "password not changed";
		
		return returnmessage;
	}
	
	
	/*
	@GetMapping("/finduser/{idUser}")
	public String findUser(@PathVariable("idUser") Integer theIdUser) {

		if (usersService.(theIdUser)) {
			return "user found";
		}
		return "user not found";

	}
	*/
	
	/*
	@GetMapping("/findbyusername/{user_name}")
	public Users findByUsername(@PathVariable("user_name") String theUsername)
	{
		Users aUsers = null;
		
		aUsers = service.findByUsername(theUsername);
		
		if(aUsers!=null)
		{
			return aUsers;
		}
		return null;
	}
	*/
	
	/*
	@DeleteMapping("/finduser/{idUser}")
	public String deleteUser(@PathVariable("idUser") Integer theIdUser) {
		

		if (service.deleteUser(theIdUser)) {
			return "user deleted";
		}
		return "user not found";
	}
	*/
	
}
