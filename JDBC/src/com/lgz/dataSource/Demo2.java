package com.lgz.dataSource;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.dbcp.BasicDataSourceFactory;

public class Demo2 {

	private static BasicDataSource basicDataSource;
	
	static {
		InputStream is = Demo2.class.getResourceAsStream("/dbcp.properties");
		Properties properties = new Properties();
		try {
			properties.load(is);
			basicDataSource = (BasicDataSource) BasicDataSourceFactory.createDataSource(properties);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println(basicDataSource.getConnection());
		System.out.println(basicDataSource.getConnection());
		System.out.println(basicDataSource.getConnection());
	}
}
