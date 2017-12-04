package database_package;

import java.sql.DriverManager;
import java.sql.*;

public class MainActivity {
	private static final String DB_URL  = "jdbc:mysql://localhost:3306/database2";
	private static String sql_code = "select * from credentials";
	private static String credentials_firstname = "firstname"; 
	private static String credentials_lastname = "lastname"; 
	private static String credentials_password = "password"; 
	public static String newline = System.getProperty("line.separator");
	
	
	public static void main(String[] args) {
		
		try{
			//here I get connection to the database
			Connection conn = DriverManager.getConnection(DB_URL, "root", "root");
			
			//here I create the statement
			Statement stmnt = conn.createStatement();
			
			//here I execute the SQL query code
			ResultSet rs = stmnt.executeQuery(sql_code);
			
			//condition
			while (rs.next()){
				System.out.println(rs.getString(credentials_firstname) + newline + rs.getString(credentials_lastname) + 
						newline + rs.getString(credentials_password));
			}
			}catch(Exception exc){
				exc.printStackTrace();
		}
		
	}
}
