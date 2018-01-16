package com.lgz.DBCPSource;

import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;

public class Demo {

	private static BasicDataSource basicDataSource = new BasicDataSource();
	
	static{
		//jdbc的四大连接参数
		basicDataSource.setDriverClassName("com.mysql.jdbc.Driver");
		basicDataSource.setUrl("jdbc:mysql://localhost:3306/lgz");
		basicDataSource.setUsername("root");
		basicDataSource.setPassword("lgz");
		//设置初始化个数
		basicDataSource.setInitialSize(5);
		//设置最大的连接个数
		basicDataSource.setMaxActive(10);
		//设置最大的空闲连接个数
		basicDataSource.setMaxIdle(7);
		//最小的空闲个数
		basicDataSource.setMinIdle(2);
		//设置最大的等待时间
		basicDataSource.setMaxWait(3000);
	}
	
	public static void main(String[] args) throws SQLException {
		System.out.println("连接:"+basicDataSource.getConnection());
		System.out.println("连接:"+basicDataSource.getConnection());
		System.out.println("连接:"+basicDataSource.getConnection());
		System.out.println("连接:"+basicDataSource.getConnection());
		System.out.println("连接:"+basicDataSource.getConnection());
		System.out.println("连接:"+basicDataSource.getConnection());
		System.out.println("连接:"+basicDataSource.getConnection());
		System.out.println("连接:"+basicDataSource.getConnection());
		System.out.println("连接:"+basicDataSource.getConnection());
		System.out.println("连接:"+basicDataSource.getConnection());
		System.out.println("连接:"+basicDataSource.getConnection());
		System.out.println("连接:"+basicDataSource.getConnection());
		System.out.println("连接:"+basicDataSource.getConnection());
		System.out.println("连接:"+basicDataSource.getConnection());
		System.out.println("连接:"+basicDataSource.getConnection());
		System.out.println("连接:"+basicDataSource.getConnection());
		System.out.println("连接:"+basicDataSource.getConnection());
		System.out.println("连接:"+basicDataSource.getConnection());
		System.out.println("连接:"+basicDataSource.getConnection());
		System.out.println("连接:"+basicDataSource.getConnection());
		System.out.println("连接:"+basicDataSource.getConnection());
		System.out.println("连接:"+basicDataSource.getConnection());
		System.out.println("连接:"+basicDataSource.getConnection());
		System.out.println("连接:"+basicDataSource.getConnection());
		System.out.println("连接:"+basicDataSource.getConnection());
	}
}
