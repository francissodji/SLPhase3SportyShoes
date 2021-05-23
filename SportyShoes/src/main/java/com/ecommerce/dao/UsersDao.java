package com.ecommerce.dao;



import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ecommerce.model.Users;

@Repository
public interface UsersDao extends CrudRepository<Users, Integer>
{
	
	
	@Query("from Users where userName=:aUsername")
	Users findByUsername(String aUsername);
	
	@Query("from Users u where u.stateConnect = true")
	List<Users> findAllConnectedUsers();
	
	@Transactional
	@Modifying
	@Query("UPDATE Users u set passWord =:aUsername where u.userName = :aPassword")
	int changePassword(String aUsername, String aPassword);
	
	
	
	
	
	/*
	Integer addUser(Users user);
	
	void updateUserName(Integer userId, String userName);
	
	void updateUserPassword(Integer userId, String passWord);
	
	boolean validateAuthentication(String userName, String passPord);
	*/
}
