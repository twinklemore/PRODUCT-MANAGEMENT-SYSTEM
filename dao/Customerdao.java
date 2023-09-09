package com.company.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.company.configuration.Helperclass;
import com.company.dto.Customer;

public class Customerdao {
Helperclass helperClass=new Helperclass();
Connection connection=null;
int i=0;
//to save customer
public Customer saveCustomer(Customer customer){
	connection=helperClass.getconnection();
	String sql="INSERT INTO customer VALUES(?,?,?)";
	try {
		//to create statement by dynamic approach
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		//passed the values to delimiters/placeholders
		preparedStatement.setInt(1,customer.getId());
		preparedStatement.setString(2,customer.getName());
		preparedStatement.setString(3,customer.getEmail());
		//execute statement
		preparedStatement.execute();
	}
	catch(SQLException e) {
		e.printStackTrace();
	}finally {
		try {
			connection.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	return customer;
}

//to retrieve customer
	public void retrieveCustomer() {
connection=helperClass.getconnection();
		
		String sql="SELECT * FROM customer";
		//create statement
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			//EXECUTE STATEMENT
			ResultSet resultSet=preparedStatement.executeQuery(); 
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println("************************************************");}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}
		//to retrive all customers
		public void retrieveallCustomers() {
			connection=helperClass.getconnection();
		
		String sql="SELECT * FROM customer";
		//create statement
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			//EXECUTE STATEMENT
			ResultSet resultSet=preparedStatement.executeQuery(); 
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println("************************************************");}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
		//to delete the customer
		public boolean deleteCustomerbyId(int id) {
			
			connection=helperClass.getconnection();
			
			String sql="DELETE FROM customer WHERE id=?";
			
			try {
				PreparedStatement preparedStatement=connection.prepareStatement(sql);
				
				preparedStatement.setInt(1, id);
				
				i=preparedStatement.executeUpdate();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
			try {
			connection.close();
			} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(i>0) {
				return true;
			}else {
			return false;}
			
		
	}

//to update customer
	public boolean updateCustomerEmailbyName(int id,String Name) {
		connection=helperClass.getconnection();
		String sql="INSERT INTO customer VALUES(?,?,?)";
		int i=0;
		try {
				//create statement
				PreparedStatement preparedStatement=connection.prepareStatement(sql);
				//passed the values to delimiters/placeholders--->
			preparedStatement.setInt(1,id);
			preparedStatement.setString(2,Name);
		i=preparedStatement.executeUpdate()	;	}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
		try {
		connection.close();
		} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	
		if(i>0) {
			return true;
		}else {
			return false;
		}
	}
	
	}




		
	



