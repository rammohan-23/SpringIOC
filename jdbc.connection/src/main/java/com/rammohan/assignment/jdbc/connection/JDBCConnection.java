package com.rammohan.assignment.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Value;

public class JDBCConnection {

	@Value("${mysql.url}")
	private String url;

	@Value("${mysql.userName}")
	private String userName;

	@Value("${mysql.password}")
	private String password;

	@Value("${mysql.driver}")
	private String driver;

	public void displayConnectionInfo() {
		System.out.println("JDBCConnection [url=" + url + ", userName=" + userName + ", password=" + password
				+ ", driver=" + driver + "]");
	}

	void getJDBCConnection() throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, userName, password);
		System.out.println("Connection successful : " + con);
	}
}
