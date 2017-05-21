package org.nitesh.project.restapp.dao;
import java.sql.*;
public class DbConnection {

	public static String driverName = "com.mysql.jdbc.Driver";
	public static String url = "jdbc:mysql://localhost:3306/mydb";
	public static String username = "root";
	public static String password="hardwinter";
	Connection con = null;
	


	public Connection getConnection(){
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			
			con = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
}
