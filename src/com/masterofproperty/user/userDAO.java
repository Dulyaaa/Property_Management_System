package com.masterofproperty.user;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;


public class userDAO {
	private String dburl ="jdbc:mysql://localhost:3306/oop";
	private String dbuname="root";
	private String dbpassword="";
	private String dbdriver ="com.mysql.jdbc.Driver";
	public void loadDriver(String dbdriver)
	{
		try {
			Class.forName(dbdriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	
	public String insert(user mem)
	{
		loadDriver(dbdriver);
		Connection con = getConnection();
		String result="Data insert successfully!";
		String sql = "insert into users(firstname, lastname, email, country, password) values(?,?,?,?,?)";
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			
			ps.setString(1,mem.getFirstname());
			ps.setString(2, mem.getLastname());
			ps.setString(3, mem.getEmail());
			ps.setString(4, mem.getCountry());
			ps.setString(5, mem.getPassword());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result ="Data not inserted successfully";
		}
		return result;
	}
}

