package sef.module13.sample;

import java.sql.*;

//	This class demonstrates the use of PreparedStatements
public class PreparedStatementSample {

	public static void main(String[] args) {
		try{
			String url = "jdbc:mysql://localhost/activity";
			String user = "root";
			String pass = "abcd1234";
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection successfully established!");
			
			PreparedStatement pStmt = cn.prepareStatement("select * from Account where UPPER(LAST_NAME) = ? ");
			
			//	Change parameter to any keyword desired, if a record
			// 	matches the query then it will be displayed
			pStmt.setString(1,"DOE");
			
			ResultSet rs = pStmt.executeQuery();
			
			System.out.println("Printing Query results:");
			while(rs.next()){
				System.out.println(rs.getString(1) + " - " + 
							rs.getString(2) + " - " + 
							rs.getString(3) + " - " + 
							rs.getString(4));
					
			}
			
			cn.close();
			
		}catch (Exception e){
			System.out.println(e.getMessage());
		}

	}

}
