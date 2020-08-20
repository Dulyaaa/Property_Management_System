package com.masterofproperty.model;

public class ModelApartment {
	private int id;
	
    private String name;
	
	private int price;
	
	private String address;
	
	private String city;
	
	private int floorArea;
	
	private int NoOfBedRooms;
	
	private String description;
	
	private int userID;

	public ModelApartment(int id) {
		super();
		this.id = id;
	}

	public ModelApartment(String name, int price, String address, String city, int floorArea, int noOfBedRooms,
			String description) {
		super();
		this.name = name;
		this.price = price;
		this.address = address;
		this.city = city;
		this.floorArea = floorArea;
		NoOfBedRooms = noOfBedRooms;
		this.description = description;
	}

	public ModelApartment() {
		super();
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public int getprice() {
		return price;
	}

	public void setprice(int price) {
		this.price = price;
	}

	public String getaddress() {
		return address;
	}

	public void setaddress(String address) {
		this.address = address;
	}

	public String getcity() {
		return city;
	}

	public void setcity(String city) {
		this.city = city;
	}

	public int getfloorArea() {
		return floorArea;
	}

	public void setfloorArea(int floorArea) {
		this.floorArea = floorArea;
	}

	public int getNoOfBedRooms() {
		return NoOfBedRooms;
	}

	public void setNoOfBedRooms(int NoOfBedRooms) {
		this.NoOfBedRooms = NoOfBedRooms;
	}

	public String getdescription() {
		return description;
	}

	public void setdescription(String description) {
		this.description = description;
	}
	
}
