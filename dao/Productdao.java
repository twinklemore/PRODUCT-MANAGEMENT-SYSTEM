package com.company.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.company.configuration.Helperclass;
import com.company.dto.Product;

public class Productdao {
	Helperclass helperClass=new Helperclass();
	Connection connection=null;
	int i=0;
	//to save product
	
	public Product saveProduct(Product product){
		//step 2:create connection
		connection=helperClass.getconnection();
		String sql="INSERT INTO product VALUES(?,?,?)";
		try {
			//step 3:to create statement by dynamic approach
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			//passed the values to delimiters/placeholders
			preparedStatement.setInt(1,product.getId());
			preparedStatement.setString(2,product.getName());
			preparedStatement.setDouble(3,product.getPrice());
			//step 4:execute statement
			preparedStatement.execute();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				//step 5:close the statement
				connection.close();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			
		}
		return product;
	}

	//to retrieve product
public void retrieveProduct() {
connection=helperClass.getconnection();
	
	String sql="SELECT * FROM product";
	//create statement
	try {
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		//EXECUTE STATEMENT
		ResultSet resultSet=preparedStatement.executeQuery(); 
		while(resultSet.next()) {
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString(2));
			System.out.println(resultSet.getDouble(3));
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
//to retrive all products
public void retrieveallProducts() {
	connection=helperClass.getconnection();

String sql="SELECT * FROM product";
//create statement
try {
	PreparedStatement preparedStatement=connection.prepareStatement(sql);
	//EXECUTE STATEMENT
	ResultSet resultSet=preparedStatement.executeQuery(); 
	while(resultSet.next()) {
		System.out.println(resultSet.getInt(1));
		System.out.println(resultSet.getString(2));
		System.out.println(resultSet.getDouble(3));
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
//to delete the product
		public boolean deleteProductbyName(String Name) {
			
			connection=helperClass.getconnection();
			
			String sql="DELETE FROM product WHERE Name=?";
			
			try {
				PreparedStatement preparedStatement=connection.prepareStatement(sql);
				
				preparedStatement.setString(2,Name);
				
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
			return false;
			}
		}
		
			//to update product
			public boolean updateProductPricebyName(double price,String Name) {
				connection=helperClass.getconnection();
				String sql="INSERT INTO product VALUES(?,?,?)";
				int i=0;
				try {
						//create statement
						PreparedStatement preparedStatement=connection.prepareStatement(sql);
						//passed the values to delimiters/placeholders--->
					preparedStatement.setDouble(3,price);
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
