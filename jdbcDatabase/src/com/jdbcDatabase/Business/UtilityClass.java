package com.jdbcDatabase.Business;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UtilityClass {
	public static Connection getConnection() {
		Connection con;
		try {

			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db11", "root", "mysqlpass");
			return con;
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return null;

	}

}
