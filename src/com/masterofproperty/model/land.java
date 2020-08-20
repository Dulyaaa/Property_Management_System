package com.masterofproperty.model;


public class land {
	private String location,description;
	float price;
	private float area;
	private int userID, id;
	
	public land() {
		super();
	}
	
	public land(int id,String location, String description, float price, float area, int userID) {
		super();
		this.location = location;
		this.description = description;
		this.price = price;
		this.area = area;
		this.userID = userID;
		this.id = id;
	}

	public land(int id,String location, String description, float price, float area) {
		super();
		this.location = location;
		this.description = description;
		this.price = price;
		this.area = area;
		this.id = id;
	}
	
	
	

	public land(String location, String description, float price, float area, int userID) {
		super();
		this.location = location;
		this.description = description;
		this.price = price;
		this.area = area;
		this.userID = userID;
	}

	public land(String location, float area, float price,  String description) {
		super();
		this.location =location;
		this.price = price;
		this.area =area;
		this.description = description;
	}
	public String getLocation() {
		return location;
	}
	public void setName(String location) {
		this.location = location;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float f) {
		this.price = f;
	}
	public float getarea() {
		return area;
	}
	public void setPerches(float area) {
		this.area =area;
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
		
}
