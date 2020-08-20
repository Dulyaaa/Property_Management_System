package com.masterofproperty.land.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.annotation.Resource;
import javax.sql.DataSource;

import com.masterofproperty.model.House;
import com.masterofproperty.model.land;

/**
 * Session Bean implementation class HouseDAO
 */
public class landDAO {
	private String dburl ="jdbc:mysql://localhost:3306/oop";
	private String dbuname="root";
	private String dbpassword="";
	private String dbdriver ="com.mysql.jdbc.Driver";
	private Connection connection;
	
	public void loadDriver() throws SQLException
	{
		try {
			Class.forName(dbdriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		connection = DriverManager.getConnection(dburl, dbuname, dbpassword);
	}
	
	public Connection getConnection()
	{
		Connection con = null;
		try {
			con = DriverManager.getConnection(dburl, dbuname, dbpassword);
			System.out.println("Connected");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("not connected");
		}
		return con;
	}
//@Stateless
//@LocalBean
//public class HouseDAO {
	//@Resource(name="jdbc/housedbc")
	private DataSource ds;
	
public boolean newl(land land) throws SQLException{
	
	String sql = "insert into land(location, price, area, description, userID) values(?, ?, ?, ?, ?)";
	
	loadDriver();
	
	PreparedStatement statement = connection.prepareStatement(sql);

	statement.setString(1, land.getLocation());
	statement.setFloat(2, land.getPrice());
	statement.setFloat(3, land.getArea());
	statement.setString(4, land.getDescription());
	statement.setInt(5, land.getUserID());
	
	boolean rowInserted = statement.executeUpdate() > 0;
	
	return rowInserted;
}

//public void editHouse(House house){
	//String sql = "update House set name='"+house.getName()+"',price='"+house.getPrice()+"',address='"+house.getAddress()+"',perches='"+house.getPerches()+"',noOfBedRooms='"+house.getNoOfBedRooms()+"',description='"+house.getDescription()+"' where name='"+)";
	//executeModifyQuery(sql);
//}

public boolean deleteHouse(int id) throws SQLException{
	
	String sql ="delete from house where id=?";
	System.out.println("deleted");
	
	loadDriver();
	
	PreparedStatement statement = connection.prepareStatement(sql);
	statement.setInt(1, id);
	
	boolean rowInserted = statement.execute();
	
	statement.close();
	
	return rowInserted;
}
	
public House getHouse(int id) throws SQLException{
	House house = new House();
	String sql = "select * from house where id='"+id+"'";

	loadDriver();
	
	Statement st = connection.createStatement();
	
	ResultSet rs = st.executeQuery(sql);
	
	try{
		while(rs.next()){
			
			house.setName(rs.getString("name"));
			house.setPrice(Float.parseFloat(rs.getString("price")));
			house.setAddress(rs.getString("address"));
			house.setPerches(Float.parseFloat(rs.getString("perches")));
			house.setNoOfBedRooms(Integer.parseInt(rs.getString("noOfBedRooms")));
			house.setDescription(rs.getString("description"));
		}
		
		st.close();
		
	}catch(Exception ex1){
		System.out.println(ex1.getMessage());
	}
	return house;

}
public ArrayList<land> All() throws SQLException{
	
	ArrayList<land> lands = new ArrayList<land>();
	
	String sql = "select * from land";
	
	loadDriver();
	
	Statement statement = connection.createStatement();
    ResultSet rs = statement.executeQuery(sql);
	

		while(rs.next()){
			land land = new land();
			land.setLocation(rs.getString("location"));
			land.setDescription(rs.getString("description"));
			land.setPrice(Float.parseFloat(rs.getString("price")));
			land.setArea(Float.parseFloat(rs.getString("area")));
			land.setId(rs.getInt("id"));
			
			lands.add(land);
		}
		
	return lands;
}

public boolean update(House house) {
	// TODO Auto-generated method stub
	try {
		loadDriver();
		
		
		 String sql = "UPDATE house " + "SET name = ?, " + "address = ?, " + "description = ?, " + "price = ?, "  + "perches = ?, "  + "NoOfBedrooms = ?, "  + "WHERE id = ?";
		
		PreparedStatement st = connection.prepareStatement(sql);
		
		st.setString(1,house.getName());
		st.setString(2,house.getAddress());
		st.setString(3,house.getDescription());
		st.setFloat(4,house.getPrice());
		st.setFloat(5,house.getPerches());
		st.setInt(6,house.getNoOfBedRooms());
		st.setInt(7,house.getId());

		st.executeUpdate();
		
		st.close();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return true;
}
	
  
public void executeModifyQuery(String sql){
	try{
	Connection conn = ds.getConnection();
	conn.createStatement().execute(sql);
	conn.close();
	} catch(Exception e){
		System.out.println(e.getMessage());
	}
}

public ResultSet executeFetchQuery(String sql){
	ResultSet rs = null;
	try{
	Connection conn = ds.getConnection();
	rs = conn.createStatement().executeQuery(sql);
	conn.close();
	} catch(Exception e){
		System.out.println(e.getMessage());
	}
	return rs;
}

}
