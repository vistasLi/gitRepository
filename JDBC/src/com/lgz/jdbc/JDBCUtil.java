package com.lgz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtil {

	
	public static String url = null;
	public static String user = null;
	public static String pass = null;
	public static String driverClass = null;
	public static Properties pp = new Properties();
	static{
		try{
			pp.load(JDBCUtil.class.getResourceAsStream("/pro.properties"));
			driverClass = pp.getProperty("driverClass");
			url = pp.getProperty("url");
			user = pp.getProperty("user");
			pass = pp.getProperty("pass");
			
			Class.forName(driverClass);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		Connection connection = null; 
		try {
			connection = DriverManager.getConnection(url,user,pass);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return connection;
	}
	
	public static void  close(Connection conn,Statement state,ResultSet rs) {
		if(rs!=null) {
		try {
			rs.close();
		} catch (SQLException e) {
			try {
				state.close();
			} catch (SQLException e1) {
				try {
					conn.close();
				} catch (SQLException e2) {
					throw new RuntimeException(e);
				}
				throw new RuntimeException(e);
			}
			throw new RuntimeException(e);
		}
		}else {
			try {
				state.close();
			} catch (SQLException e) {
				try {
					conn.close();
				} catch (SQLException e2) {
					throw new RuntimeException(e);
				}
			}
		}
		
	}
}
