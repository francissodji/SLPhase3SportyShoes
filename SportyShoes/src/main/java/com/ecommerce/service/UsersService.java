package com.ecommerce.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.dao.UsersDao;
import com.ecommerce.model.Users;

@Service
public class UsersService {


	ArrayList<Users> al= new ArrayList<Users>();
	
	@Autowired
	private UsersDao userDao;

	
	
	//Find User by username
	
	public Users findByUsername(String aUsername)
	{
		Users aUser = null;
		
		aUser = userDao.findByUsername(aUsername);
		
		if(aUser!= null)
		{
			return aUser;
		}
		
		return aUser;
	}
	
	
	public int ChangePassword(String aUsername, String aNewPassword)
	{
		int isChanded;
		
		isChanded = userDao.changePassword(aUsername, aNewPassword);
		
		return isChanded;
	}
	
	
	//LoginValid
	public boolean loginValid(String uName,String uPass) {
		
		
		
		if(uName.equals("Admin") && uPass.equals("password")){
			
			return true;
		}
		return false;
		
	}

	public boolean addUser(Users aUser) {
		
		boolean isAdded = false;
		//statConn = false;
		if (userDao.save(aUser) != null)
		{
			isAdded = true;
		}
		
		return isAdded;
	}
	

	
	public List<Users> loadUsers(){
		
		List al=(ArrayList<Users>) userDao.findAll();
		
		return al;
	}
	
	
	public List<Users> loadConnectedUsers(){
		
		List<Users> allConnected = null;
		allConnected = userDao.findAllConnectedUsers();
		
		return allConnected;
	}
	
	

	//find user by id
	/*
	public boolean findUser(Integer idUser) {
		
		Optional<Users> find=userDao.findById(idUser);
		
		if(find.isPresent()) {
			System.out.println(find);
			return true;
		}
		
		return false;
	}
	*/
	
	/*
	@SuppressWarnings("unused")
	public Users findUserByUserName(String ausername) {
		
		Users theUser = null;
		
		Users find=userDao.findByUsername(ausername);
		
		return theUser;
	}
	*/
	
	/*
	public boolean deleteUser(Integer idUser) {
		
		Optional<Users> find = userDao.findById(idUser);
		
		if(find.isPresent()) {
			userDao.deleteById(idUser);
			return true;
		}
		
		
		return false;
	}
	*/
}
