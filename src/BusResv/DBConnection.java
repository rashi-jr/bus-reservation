package BusResv;

import java.sql.*;

public class DBConnection {
	
	private static final String url= "jdbc:mysql://localhost:3306/busresv";
	private static final String userName = "root";
	private static final String passWord = "Ra$hid@18";
	
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(url,userName,passWord);
		
	}
	
	
			

}
