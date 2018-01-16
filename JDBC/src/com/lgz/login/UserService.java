package com.lgz.login;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.lgz.jdbc.JDBCUtil;

public class UserService {

	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws Exception{
		System.out.println("请选择功能：A(注册),B(登陆)");
		
		String line = br.readLine();
		
		if("a".equalsIgnoreCase(line)) {
			regist();
		}else if("b".equalsIgnoreCase(line)) {
			login();
		}
		
	}

	private static void login() throws Exception {
		System.out.println("请输入登陆的用户名");
		String username = br.readLine();
		System.out.println("请输入登陆的密码");
		String password = br.readLine();
		String sql = "select * from lgz where lname='"+username+"',lgender='"+password+"'";
		Connection connection = JDBCUtil.getConnection();
		Statement state = connection.createStatement();
		ResultSet resultSet = state.executeQuery(sql);
		boolean b = false;
		while(resultSet.next()) {
			System.out.println("登陆成功");
			b = true;
		}
		if(!b) {
			System.out.println("登陆失败");
		}
		
	}

	private static void regist() throws IOException, SQLException {
		System.out.println("请输入注册的用户名");
		String username = br.readLine();
		System.out.println("请输入注册密码");
		String password = br.readLine();
		String sql = "insert into lgz(lname,lgender) values('"+username+"','"+password+"')";
		Connection connection = JDBCUtil.getConnection();
		Statement state = connection.createStatement();
		try{
			state.execute(sql);
			System.out.println("注册成功");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("注册失败");
		}
		
		
		
	}
}
