package com.lgz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Demo1 {

	private static final String url = "jdbc:mysql://localhost:3306/lgz";
	
	private static final String user = "root";
	
	private static final String password = "lgz";
	
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		String sql = "insert into lgz values(null,'虚竹',33223.3,'男')";
		Connection connection = DriverManager.getConnection(url, user, password);
		Statement createStatement = connection.createStatement();
		createStatement.execute(sql);
		createStatement.close();
		connection.close();
//		PreparedStatement prepareStatement = connection.prepareStatement(sql);
	}
}
