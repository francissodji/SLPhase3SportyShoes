package com.ecommerce.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idUser;
	private String firstName;
	private String lastName;
	private String userName;
	private String passWord;
	private boolean stateConnect;
	
	
	public Users() {}



	public Users(String firstName, String lastName, String userName, String passWord, boolean stateConnect) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.passWord = passWord;
		this.stateConnect = stateConnect;
	}



	public boolean isStateConnect() {
		return stateConnect;
	}


	public void setStateConnect(boolean stateConnect) {
		this.stateConnect = stateConnect;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassWord() {
		return passWord;
	}


	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}


	public Integer getIdUser() {
		return idUser;
	}


	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}

	

	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	@Override
	public String toString() {
		return "Users [idUser=" + idUser + ", firstName=" + firstName + ", lastName=" + lastName + ", userName="
				+ userName + ", passWord=" + passWord + ", stateConnect=" + stateConnect + "]";
	}


}
