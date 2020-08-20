package com.masterofproperty.model;

public class House {
	int id, userID;
	private String name,address,description;
	float price;
	private float perches;
	private int noOfBedRooms;
	
	public House() {
		super();
	}	
	
	public House(int id) {
		super();
		this.id = id;
	}

	public House( String name, String address, String description, float price, float perches, int noOfBedRooms, int userID) {
		super();
		this.userID = userID;
		this.name = name;
		this.address = address;
		this.description = description;
		this.price = price;
		this.perches = perches;
		this.noOfBedRooms = noOfBedRooms;
	}



	public House(int id, String name, String address, String description, float price, float perches, int noOfBedRooms) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.description = description;
		this.price = price;
		this.perches = perches;
		this.noOfBedRooms = noOfBedRooms;
	}



	public House(int id, int userID, String name, String address, String description, float price, float perches, int noOfBedRooms) {
		super();
		this.id = id;
		this.userID = userID;
		this.name = name;
		this.address = address;
		this.description = description;
		this.price = price;
		this.perches = perches;
		this.noOfBedRooms = noOfBedRooms;
	}



	public House(String name, float price2, String address, float perches2, int noOfBedRooms2, String description) {
		super();
		this.name = name;
		this.price = price2;
		this.address = address;
		this.perches = perches2;
		this.noOfBedRooms = noOfBedRooms2;
		this.description = description;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	public float getPerches() {
		return perches;
	}
	public void setPerches(float f) {
		this.perches = f;
	}
	public int getNoOfBedRooms() {
		return noOfBedRooms;
	}
	public void setNoOfBedRooms(int i) {
		this.noOfBedRooms = i;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}
	
}
