package com.lgz.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.junit.Test;

public class PreparedStatementDemo {

	@Test
	public void addTest() throws SQLException {
		Connection conn = JDBCUtil.getConnection();
		String sql ="insert into lgz(lname,lgender) values(?,?)";
		PreparedStatement prepare = conn.prepareStatement(sql);
		prepare.setString(1, "申公豹");
		prepare.setString(2, "男");
		prepare.execute();
		JDBCUtil.close(conn, prepare, null);
	}
}
