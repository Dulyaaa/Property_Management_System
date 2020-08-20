package com.masterofproperty.user;

public class user
{
	private int userID;
	private String firstname,lastname,email,country,password;
	
	public user() {
		super();
	}
	
	public user(int userID, String firstname, String lastname, String email, String country, String password) {
		super();
		this.userID = userID;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.country = country;
		this.password = password;
	}

	public user(String firstname, String lastname, String email, String country, String password) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.country = country;
		this.password = password;
	}
	
	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password){
		this.password =password;
	}
	}
	

