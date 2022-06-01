package com.tutorial.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtils {
	private static String DB_URL = "jdbc:mysql://localhost:3306/estatebasic122021";
	private static String USER = "root";
	private static String PASS = "123456789";
	private Connection conn = null;
	public static Connection getConnections() throws SQLException{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(DB_URL, USER, PASS);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void closeConnections(Statement stmt,ResultSet rs,Connection conn) {
		try {
			if (stmt != null) {					
				stmt.close();					
			}
			if(rs !=null) {
				rs.close();
			}				
			if(conn!=null) {
				conn.close();
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
