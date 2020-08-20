package com.masterofproperty.idealhome.services;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.masterofproperty.model.IdealHome;

public interface IIdealHome {
	
	public IdealHome getIdealhome(int id) throws SQLException;
	
	public boolean newIdealHome(IdealHome service) throws SQLException;
	
	boolean updateIdealHome(IdealHome idealhome) throws SQLException;
	
	public boolean deleteIdealHome(IdealHome idealhome) throws SQLException;
	
	public List<IdealHome> displayIdealHome() throws SQLException;
	
	public List<IdealHome> displayIdealHomeWithID() throws SQLException;
	
}
