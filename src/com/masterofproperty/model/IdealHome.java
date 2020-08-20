package com.masterofproperty.model;

public class IdealHome {
	
	private int sID;
	private int userID;
	private String title;
	private String description;
	private String name;
	private String email;
	private String pnumber;
	
	public IdealHome() {
		super();
	}

	public IdealHome(int sID) {
		super();
		this.sID = sID;
	}

	public IdealHome(int sID, String title, String description, String name, String email, String pnumber) {
		super();
		this.sID = sID;
		this.title = title;
		this.description = description;
		this.name = name;
		this.email = email;
		this.pnumber = pnumber;
	}
	
	public IdealHome(String title, String description, String name, String email, String pnumber, int userID) {
		super();
		this.title = title;
		this.description = description;
		this.name = name;
		this.email = email;
		this.pnumber = pnumber;
		this.userID = userID;
	}

	public IdealHome(int sID, int userID, String title, String description, String name, String email, String pnumber) {
		super();
		this.sID = sID;
		this.userID = userID;
		this.title = title;
		this.description = description;
		this.name = name;
		this.email = email;
		this.pnumber = pnumber;
	}

	public IdealHome(String title, String description, String name, String email, String pnumber) {
		super();
		this.title = title;
		this.description = description;
		this.name = name;
		this.email = email;
		this.pnumber = pnumber;
	}

	public int getsID() {
		return sID;
	}

	public void setsID(int sID) {
		this.sID = sID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPnumber() {
		return pnumber;
	}

	public void setPnumber(String pnumber) {
		this.pnumber = pnumber;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}
	
	
}
