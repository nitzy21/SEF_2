package sef.module13.sample;

import java.sql.*;

public class StatementSample {

	//	Take note that not all statements are supported by all servers
	//	Some statements, like a few used here, are not STANDARD SQL statements
	public static void main(String[] args) {
		try{
			String url = "jdbc:mysql://localhost/activity";
			String user = "root";
			String pass = "abcd1234";
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection successfully established!");
			
			System.out.println("***List of Available Databases***");
			
			//	First statment to be executed lists all available databases
			// 	on the server
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery("show databases");			
			
			while(rs.next()){
				System.out.println(rs.getString(1));
			}
			
			System.out.println("\n***List of Tables in 'Sample' database***");
			
			//	This statement lists all tables found in the currently selected
			// 	database, which in this case is the 'dog' database as defined
			//	in the URL set when establishing a connection
			rs = st.executeQuery("show tables");			
			
			while(rs.next()){
				System.out.println(rs.getString(1));
			}
			
			System.out.println("\n***List of Columns in 'Account' Table***");
			
			//	This statement lists all columns found in the currently selected
			// 	table, which in this case is the 'dog' table
			rs = st.executeQuery("show columns from Account");			
			
			while(rs.next()){
				System.out.println(rs.getString(1));
			}
			
			System.out.println("\n***List all entries in the Account Table***");
			
			//	This statement is a STANDARD SQL Statement
			//	This statement lists all dog records from the 'dog' table
			rs = st.executeQuery("select * from Account");			
			
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
