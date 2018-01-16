package com.lgz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectDemo {

	
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/lgz";
		String user = "root";
		String pass = "lgz";
		Connection connection = DriverManager.getConnection(url, user, pass);
		Statement createStatement = connection.createStatement();
		String sql = "select * from lgz";
		ResultSet executeQuery = createStatement.executeQuery(sql);
		while(executeQuery.next()) {
			System.out.println("id:"+executeQuery.getObject(1)+"姓名："+executeQuery.getObject(2)+"工资："+executeQuery.getObject(3)+"性别："+executeQuery.getObject(4)+"..");
		}
		executeQuery.close();
		createStatement.close();
		connection.close();
	}
}
