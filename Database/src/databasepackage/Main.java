package databasepackage;

import java.sql.DriverManager;
import java.sql.ResultSet;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Main {

	public static void main(String[] args) {
		
	try {
	   //connection to database
	   Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/afdemp", "root", "root");
	   
	   //create statement 
	   Statement myStmt = (Statement) myConn.createStatement();
	   
	   //execute sql query
	   ResultSet myRs = myStmt.executeQuery("select * from employees");
	   
	   //results set
	   while (myRs.next()) {
		
	    System.out.println("email: " + myRs.getString("email")+ " , "+ "First name: " + myRs.getString("FName")+ " , " + "Last name" + myRs.getString("LName"));
	   }
	  }
	  catch (Exception exc) {
	   exc.printStackTrace();
	  }

	}
}
