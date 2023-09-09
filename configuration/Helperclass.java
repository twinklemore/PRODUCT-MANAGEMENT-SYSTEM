package com.company.configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Helperclass {
	String url="jdbc:mysql://localhost:3306/product_management_jdbc";
	String username="root";
	String password="root";
	Connection connection=null;
	//to create connection between mysql and java
	public Connection getconnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection(url,username,password);
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return connection;
		
	}
}
