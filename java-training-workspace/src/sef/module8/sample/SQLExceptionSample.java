package sef.module8.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLExceptionSample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			String url = "jdbc:mysql://localhost/activity1"; // this will throw an exception since
															 // activity1 is not an existing database
			String user = "root";
			String pass = "abcd1234";
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection successfully established! \n");
			
			cn.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}

	}

}
