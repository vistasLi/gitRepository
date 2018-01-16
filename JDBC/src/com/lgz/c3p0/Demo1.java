package com.lgz.c3p0;

import java.beans.PropertyVetoException;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class Demo1 {
	
	public static ComboPooledDataSource com = new ComboPooledDataSource();
	
	//配置连接池的参数
	static {
		//配置数据库的四大连接参数
		try {
			com.setDriverClass("com.mysql.jdbc.Driver");
			com.setJdbcUrl("jdbc:mysql://localhost:3306/lgz");
			com.setUser("root");
			com.setPassword("lgz");
			//设置连接池的基本参数
			com.setInitialPoolSize(5);//初始化连接个数
			com.setMaxPoolSize(10);//设置连接池的最大连接个数
			com.setMaxIdleTime(3000);//设置最大空闲时间
			com.setMinPoolSize(2);//设置最小的连接个数
			//c3p0要等到没有连接才增加
			
			com.setCheckoutTimeout(3000);//设置最大的等待时间
		} catch (PropertyVetoException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws SQLException {
		System.out.println(com.getConnection());
		System.out.println(com.getConnection());
		System.out.println(com.getConnection());
		System.out.println(com.getConnection());
		System.out.println(com.getConnection());
		System.out.println(com.getConnection());
		System.out.println(com.getConnection());
		System.out.println(com.getConnection());
		System.out.println(com.getConnection());
		System.out.println(com.getConnection());
	}
	
}
