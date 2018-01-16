package com.lgz.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UtilTest {

	public static void main(String[] args) throws SQLException {
		Connection connection = JDBCUtil.getConnection();
		String sql = "select * from lgz";
		Statement createStatement = connection.createStatement();
		ResultSet resultSet = createStatement.executeQuery(sql);
		while(resultSet.next()) {
			System.out.println("姓名:"+resultSet.getObject(2)+",工资:"+resultSet.getObject(3));
		}
		JDBCUtil.close(connection, createStatement, resultSet);
	}
}
