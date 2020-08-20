package com.masterofproperty.userValidation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.masterofproperty.user.*;

public class loginValidDAO {
	
	static Connection currentCon = null;
	   static ResultSet rs = null;  
	   static Statement statement = null;
	    private String jdbcURL;
	    private String jdbcUsername;
	    private String jdbcPassword;
	    private Connection jdbcConnection;
	    private int userID;
	    private String firstname;
	    
	   
		public loginValidDAO() {
			super();
		}

		public loginValidDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) {
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
	    
		
		public String validuser(user user) {
			
			String email = user.getEmail();
			String password = user.getPassword();
			
			Connection con = null;
	        Statement statement = null;
	        ResultSet resultSet = null;

	        String emailDB = "";
	        String passwordDB = "";
	        String firstnameDB = "";
	        int id;

	        try
	        {
	            connect(); //Fetch database connection object
	            statement = jdbcConnection.createStatement(); //Statement is used to write queries. Read more about it.
	            resultSet = statement.executeQuery("select email, password, firstname, userID from users"); //the table name is users and userName,password are columns. Fetching all the records and storing in a resultSet.

	            while(resultSet.next()) // Until next row is present otherwise it return false
	            {
	             emailDB = resultSet.getString("email"); //fetch the values present in database
	             passwordDB = resultSet.getString("password");
	             firstnameDB = resultSet.getString("firstname");
	             id = resultSet.getInt("userID");
	             
	              if(email.equals(emailDB) && password.equals(passwordDB))
	              {
	            	  firstname = firstnameDB;
	            	  userID = id;
	            	  
	                 return "SUCCESS"; ////If the user entered values are already present in the database, which means user has already registered so return a SUCCESS message.
	              }
	          }}
	           
	            catch(SQLException e)
	            {
	               e.printStackTrace();
	            }
	            
	            return "Invalid user credentials"; // Return appropriate message in case of failure
		}
		
		public int getUID() {
			System.out.println(userID);
			return userID;
		}
		
		public String getFirstname() {
			System.out.println(firstname);
			return firstname;
		}

}
