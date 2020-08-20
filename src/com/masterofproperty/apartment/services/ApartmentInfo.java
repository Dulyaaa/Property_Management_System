package com.masterofproperty.apartment.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.masterofproperty.model.ModelApartment;


public class ApartmentInfo implements IApartment{

	@Override
	public void addApartmentInfo(ModelApartment apartInfo) {
		// TODO Auto-generated method stub
		try {
			Connection con = DbConnection.getConnection(); 
			PreparedStatement st = con.prepareStatement("insert into apartment(name,price,address,city,floorArea,NoOfBedRooms,description, userID) values(?,?,?,?,?,?,?, ?)");
			
			st.setString(1,apartInfo.getname());
			st.setInt(2,apartInfo.getprice());
			st.setString(3,apartInfo.getaddress());
			
			st.setString(4,apartInfo.getcity());
			st.setInt(5,apartInfo.getfloorArea());
			
			st.setInt(6,apartInfo.getNoOfBedRooms());
			st.setString(7,apartInfo.getdescription());	
			st.setInt(8, apartInfo.getUserID());

			st.executeUpdate();
			
			st.close();
			con.close();		
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public ArrayList<ModelApartment> getApartments() {
		// TODO Auto-generated method stub
		ArrayList<ModelApartment> datarate = new ArrayList<ModelApartment>();
		try { 
			
			Connection con = DbConnection.getConnection(); 			
			Statement st  = con.createStatement();
			
			
			
			String sql ="select id,name,price,address,city,floorArea,NoOfBedRooms,description from apartment";
			ResultSet res = st.executeQuery(sql);
		
			while(res.next()){
				
				ModelApartment MA = new ModelApartment();
				
				MA.setid(Integer.parseInt(res.getString("id")));
				MA.setname(res.getString("name"));
				MA.setprice(Integer.parseInt(res.getString("price")));
				MA.setaddress(res.getString("address"));
				MA.setcity(res.getString("city"));
				MA.setfloorArea(Integer.parseInt(res.getString("floorArea")));
				MA.setNoOfBedRooms(Integer.parseInt(res.getString("NoOfBedRooms")));
				MA.setdescription(res.getString("description"));
	
				datarate.add(MA);
			}
			
			con.close();
			st.close();
			} catch (Exception e) {
				System.out.println("exception");
				System.out.println(e);
	        }
		return datarate;
	}

	@Override
	public boolean deleteApartment(int id) {
		// TODO Auto-generated method stub
		
		try { 
			
			Connection con = DbConnection.getConnection(); 			
			
			
			
			String query = "delete from apartment where id = ?";
		      PreparedStatement preparedStmt = con.prepareStatement(query);
		      preparedStmt.setInt(1, id);

		      // execute the preparedstatement
		      preparedStmt.execute();
			
		      con.close();
		      preparedStmt.close();
		      
			} catch (Exception e) {
				System.out.println("exception");
				System.out.println(e);
	        }
		return true;
	}

	@Override
	public ModelApartment getApartmanetById(int id) {
		// TODO Auto-generated method stub
		ModelApartment MA = new ModelApartment();
		try { 
			
			Connection con = DbConnection.getConnection(); 			
			Statement st  = con.createStatement();
			
			
			
			String sql ="select id,name,price,address,city,floorArea,NoOfBedRooms,description from apartment where id = '"+id+"'";
			ResultSet res = st.executeQuery(sql);
		
			while(res.next()){
				
				
				
				MA.setid(Integer.parseInt(res.getString("id")));
				MA.setname(res.getString("name"));
				MA.setprice(Integer.parseInt(res.getString("price")));
				MA.setaddress(res.getString("address"));
				MA.setcity(res.getString("city"));
				MA.setfloorArea(Integer.parseInt(res.getString("floorArea")));
				MA.setNoOfBedRooms(Integer.parseInt(res.getString("NoOfBedRooms")));
				MA.setdescription(res.getString("description"));
	
				
			}
			
			con.close();
			st.close();
			} catch (Exception e) {
				System.out.println("exception");
				System.out.println(e);
	        }
		
		return MA;
	}

	@Override
	public boolean updateApartment(ModelApartment apartInfo) {
		// TODO Auto-generated method stub
		try {
			Connection con = DbConnection.getConnection(); 
			
			
			 String sqlUpdate = "UPDATE apartment "
		                + "SET name = ?, "
		                + "price = ?, "
		                + "address = ?, "
		                + "city = ?, "
		                + "floorArea = ?, "
		                + "NoOfBedRooms = ?, "
		                + "description = ? "
		                + "WHERE id = ?";
			
			PreparedStatement st = con.prepareStatement(sqlUpdate);
			
			st.setString(1,apartInfo.getname());
			st.setInt(2,apartInfo.getprice());
			st.setString(3,apartInfo.getaddress());
			
			st.setString(4,apartInfo.getcity());
			st.setInt(5,apartInfo.getfloorArea());
			
			st.setInt(6,apartInfo.getNoOfBedRooms());
			st.setString(7,apartInfo.getdescription());	
			st.setInt(8,apartInfo.getid());

			st.executeUpdate();
			
			st.close();
			con.close();		
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}


}
