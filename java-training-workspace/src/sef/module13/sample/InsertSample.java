package sef.module13.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertSample {

	public static void main(String[] args) {
		try{
			String url = "jdbc:mysql://localhost/activity";
			String user = "root";
			String pass = "abcd1234";
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection(url, user, pass);
			cn.setAutoCommit(false);
			System.out.println("Connection successfully established!");
			
			PreparedStatement pStmt 
				= cn.prepareStatement("insert into Account (FIRST_NAME, LAST_NAME, E_MAIL) VALUES (?,?,?)");
			
			//	Change parameter to any keyword desired, if a record
			// 	matches the query then it will be displayed
			pStmt.setString(1,"Clark");
			pStmt.setString(2,"Kent");
			pStmt.setString(3,"clark.kent@dailyplanet.com");
			
			int rows = pStmt.executeUpdate();
			cn.commit();	
			System.out.println(rows + " added!");
			
			cn.close();
			
		}catch (Exception e){
			System.out.println(e.getMessage());
		}

	}
}
