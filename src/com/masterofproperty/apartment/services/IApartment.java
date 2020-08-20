package com.masterofproperty.apartment.services;

import java.util.ArrayList;

import com.masterofproperty.model.ModelApartment;


public interface IApartment {
	
	public void addApartmentInfo(ModelApartment apartInfo);
	public ArrayList<ModelApartment> getApartments();
	public boolean deleteApartment(int id);
	public ModelApartment getApartmanetById(int id);
	public boolean updateApartment(ModelApartment apartInfo);
}
