package com.masterofproperty.idealhome.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.masterofproperty.model.IdealHome;


public class IdealHomeDAO implements IIdealHome{

    private String jdbcURL;
    private String jdbcUsername;
    private String jdbcPassword;
    private Connection jdbcConnection;

	public IdealHomeDAO() {
		super();
	}
	
    public IdealHomeDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) {
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
	
	@Override
	public boolean newIdealHome(IdealHome service) throws SQLException {
		
		String sql = "INSERT INTO idealhome(title, description, name, email, pnumber, userID) VALUES(?, ?, ?, ?, ?, ?)";
		
		connect();
		
		PreparedStatement statement = jdbcConnection.prepareStatement(sql);

		statement.setString(1, service.getTitle());
		statement.setString(2, service.getDescription());
		statement.setString(3, service.getName());
		statement.setString(4, service.getEmail());
		statement.setString(5, service.getPnumber());
		statement.setInt(6, service.getUserID());
		
		boolean rowInserted = statement.executeUpdate() > 0;
		statement.close();
		disconnect();
		
		return rowInserted;
	}

	@Override
	public boolean updateIdealHome(IdealHome idealhome) throws SQLException{
		// TODO Auto-generated method stub
		String sql = "UPDATE idealhome SET title = ?, name = ?, email = ?, pnumber = ?, description = ?";
		sql += "WHERE sID = ?";
		
		connect();
		
		PreparedStatement statement = jdbcConnection.prepareStatement(sql);

		statement.setString(1, idealhome.getTitle());
		statement.setString(2, idealhome.getName());
		statement.setString(3, idealhome.getEmail());
		statement.setString(4, idealhome.getPnumber());
		statement.setString(5, idealhome.getDescription());
		statement.setInt(6, idealhome.getsID());
		
		boolean rowUpdated = statement.executeUpdate() > 0;
        statement.close();
        disconnect();
        return rowUpdated;	
	
	}

	@Override
	public List<IdealHome> displayIdealHome() throws SQLException {
		// TODO Auto-generated method stub
	
		List<IdealHome> listIdealHome = new ArrayList<>();
		
		String sql = "SELECT * from idealhome";
		
		connect();
		
		Statement statement = jdbcConnection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
		
		while (resultSet.next()) {
			String title = resultSet.getString("title");
			String description = resultSet.getString("description");
			String name = resultSet.getString("name");
			String email = resultSet.getString("email");
			String number = resultSet.getString("pnumber");
			
			IdealHome idealhome = new IdealHome(title, description, name, email, number);
			listIdealHome.add(idealhome);
		}
		
		resultSet.close();
		statement.close();
		
		disconnect();
		
		return listIdealHome;
	}
	
	public List<IdealHome> displayIdealHomeWithID() throws SQLException {
		// TODO Auto-generated method stub
	
		List<IdealHome> listIdealHome = new ArrayList<>();
		
		String sql = "SELECT * from idealhome";
		
		connect();
		
		Statement statement = jdbcConnection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
		
		while (resultSet.next()) {
			int sID = resultSet.getInt("sID");
			String title = resultSet.getString("title");
			String description = resultSet.getString("description");
			String name = resultSet.getString("name");
			String email = resultSet.getString("email");
			String number = resultSet.getString("pnumber");
			
			IdealHome idealhome = new IdealHome(sID,title, description, name, email, number);
			listIdealHome.add(idealhome);
		}
		
		resultSet.close();
		statement.close();
		
		disconnect();
		
		return listIdealHome;
	}

	@Override
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
	
	@Override
    public IdealHome getIdealhome(int id) throws SQLException {
    	
        IdealHome idealhome = null;
        
        String sql = "SELECT * FROM idealhome WHERE sID = ?";
         
        connect();
         
        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setInt(1, id);
         
        ResultSet resultSet = statement.executeQuery();
         
        if (resultSet.next()) {
			String title = resultSet.getString("title");
			String description = resultSet.getString("description");
			String name = resultSet.getString("name");
			String email = resultSet.getString("email");
			String number = resultSet.getString("pnumber");
             
            idealhome = new IdealHome(id, title, description, name, email, number);
        }
         
        resultSet.close();
        statement.close();
        
        disconnect();
         
        return idealhome;
               
    }

}
