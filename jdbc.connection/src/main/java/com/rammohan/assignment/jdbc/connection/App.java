package com.rammohan.assignment.jdbc.connection;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		JDBCConnection connection = context.getBean("jdbcConnectionObject", JDBCConnection.class);
		connection.displayConnectionInfo();
		connection.getJDBCConnection();
	}
}
