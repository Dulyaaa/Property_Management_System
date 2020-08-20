package com.masterofproperty.userOperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.masterofproperty.model.*;
import com.masterofproperty.user.*;

public class userAccountDAO {

    private String jdbcURL;
    private String jdbcUsername;
    private String jdbcPassword;
    private Connection jdbcConnection;
    
	public userAccountDAO() {
		super();
	}

	public userAccountDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) {
		super();
		this.jdbcURL = jdbcURL;
		this.jdbcUsername = jdbcUsername;
		this.jdbcPassword = jdbcPassword;
	}
    
	protected void connect() throws SQLException {
        if (jdbcConnection == null || jdbcConnection.isClosed()) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                throw new SQLException(e);
            }
            
            jdbcConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/oop", "root", "");
        }
    }
	
    protected void disconnect() throws SQLException {
        if (jdbcConnection != null && !jdbcConnection.isClosed()) {
            jdbcConnection.close();
        }
    }
    
    public user getUser(int id) throws SQLException {
    	
        user user = null;
        
        String sql = "SELECT * FROM users WHERE userID = ?";
         
        connect();
         
        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setInt(1, id);
         
        ResultSet resultSet = statement.executeQuery();
         
        if (resultSet.next()) {
			String firstname = resultSet.getString("firstname");
			String lastname = resultSet.getString("lastname");
			String email = resultSet.getString("email");
			String country = resultSet.getString("country");
			String password = resultSet.getString("password");
             
            user = new user(firstname, lastname, email, country, password);

        }
         
        resultSet.close();
        statement.close();
         
        return user;
               
    }
    
    //user details will be updated
	public boolean updateUser(user user) throws SQLException{
		// TODO Auto-generated method stub
		String sql = "UPDATE users SET firstname = ?, lastname = ?, email = ?, country = ?, password = ?";
		sql += "WHERE userID = ?";
		
		connect();
		
		PreparedStatement statement = jdbcConnection.prepareStatement(sql);

		statement.setString(1, user.getFirstname());
		statement.setString(2, user.getLastname());
		statement.setString(3, user.getEmail());
		statement.setString(4, user.getCountry());
		statement.setString(5, user.getPassword());
		statement.setInt(6, user.getUserID());
		
		boolean rowUpdated = statement.executeUpdate() > 0;
        statement.close();
        disconnect();
        return rowUpdated;	
	
	}
	
	//delete user created idealhome
	public boolean deleteIdealHome(IdealHome idealhome) throws SQLException {
		// TODO Auto-generated method stub
		
        String sql = "DELETE FROM idealhome WHERE sId = ?";
        
        connect();
         
        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setInt(1, idealhome.getsID());
         
        boolean rowDeleted = statement.executeUpdate() > 0;
        statement.close();
        disconnect();
        return rowDeleted;
	}
	
	//dispaly user created idealhome
	public List<IdealHome> displayIdealHome(int id) throws SQLException {
		// TODO Auto-generated method stub
	
		List<IdealHome> listIdealHome = new ArrayList<>();
		
		String sql = "SELECT * FROM idealhome WHERE userID = ?";
		
		connect();
		
		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setInt(1, id);
		
        ResultSet resultSet = statement.executeQuery();
		
		while (resultSet.next()) {
			String title = resultSet.getString("title");
			String description = resultSet.getString("description");
			String name = resultSet.getString("name");
			String email = resultSet.getString("email");
			String number = resultSet.getString("pnumber");
			
			IdealHome idealhome =  new IdealHome(title, description, name, email, number);
			listIdealHome.add(idealhome);
		}
		
		resultSet.close();
		statement.close();
		
		disconnect();
		
		return listIdealHome;
	}
	
	//delete user created apartment
	public boolean deleteapartment(ModelApartment apartment) throws SQLException {
		// TODO Auto-generated method stub
		
        String sql = "DELETE FROM apartment WHERE id = ?";
        
        connect();
         
        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setInt(1, apartment.getid());
         
        boolean rowDeleted = statement.executeUpdate() > 0;
        
        statement.close();
        disconnect();
        return rowDeleted;
	}
	
	//display user created apartment
	public List<ModelApartment> displayApartment(int id) throws SQLException {
		// TODO Auto-generated method stub
	
		List<ModelApartment> listapartment = new ArrayList<>();
		
		String sql = "SELECT * FROM apartment WHERE userID = ?";
		
		connect();
		System.out.println("connected");
		
		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setInt(1, id);
		
        ResultSet resultSet = statement.executeQuery();
		
		while (resultSet.next()) {
			String name = resultSet.getString("name");
			int price = resultSet.getInt("price");
			String address = resultSet.getString("address");
			String city = resultSet.getString("city");
			int floorarea = resultSet.getInt("floorArea");
			int noofbedrooms = resultSet.getInt("NoOfBedRooms");
			String description = resultSet.getString("description");
			
			ModelApartment apartment =  new ModelApartment(name, price, address, city, floorarea, noofbedrooms, description);
			listapartment.add(apartment);
			
			System.out.println(name);
		}
		
		resultSet.close();
		statement.close();
		
		disconnect();
		
		return listapartment;
	}
	
	//delete user created house
	public boolean deletehouse(House house) throws SQLException {
		// TODO Auto-generated method stub
		
        String sql = "DELETE FROM house WHERE id = ?";
        
        connect();
         
        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setInt(1, house.getId());
         
        boolean rowDeleted = statement.executeUpdate() > 0;
        statement.close();
        disconnect();
        return rowDeleted;
	}
	
	//display user created house
	public List<House> displayhouse(int id) throws SQLException {
		// TODO Auto-generated method stub
	
		List<House> listhouse = new ArrayList<>();
		
		String sql = "SELECT * FROM house WHERE userID = ?";
		
		connect();
		
		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setInt(1, id);
		
        ResultSet resultSet = statement.executeQuery();
		
		while (resultSet.next()) {
			String name = resultSet.getString("name");
			String address = resultSet.getString("address");
			String description = resultSet.getString("description");
			float price = resultSet.getFloat("price");
			float perches = resultSet.getFloat("perches");
			int noofbedrooms = resultSet.getInt("NoOfBedrooms");
			
			House house =  new House(name, price, address, perches, noofbedrooms, description);
			listhouse.add(house);
		}
		
		resultSet.close();
		statement.close();
		
		disconnect();
		
		return listhouse;
	}
    
}

