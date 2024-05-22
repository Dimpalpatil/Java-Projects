package mainpackage;

import java.sql.Connection;



import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.cj.jdbc.BlobFromLocator;
import com.mysql.cj.xdevapi.PreparableStatement;



public class JDBCHandling {

	Connection con = null;
	Statement pstmt = null;
			
	

	JDBCHandling(){



		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			System.out.println("got driver ");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			System.out.println("problem in loading driver");
		}
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinformation" ,"root","patil@0011");
			System.out.println("wow: connection hogya");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("problem in connection ");
		}

	}



	int insertData(String firstName,String LastName, long mobile , String address,String gender , String degree,String dob, String subject1, String subject2) {
		
		int Status = 0;
		
		try {
		//	pstmt = con.prepareStatement("insert into studenttable value (default,?,?,?,?,?,?,?,?,?)");
			pstmt = con.prepareStatement("insert into studenttable value (default,?,?,?,?,?,?,?,?,?)");
		
	
			pstmt.setString(1, firstName);
			pstmt.setString(2, LastName);
			pstmt.setLong(3, mobile);
			pstmt.setString(4, address);
			pstmt.setString(5, gender);
			pstmt.setString(6, degree);
			pstmt.setString(7, dob);
			pstmt.setString(8, subject1);
			pstmt.setString(9, subject2);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		return Status;
		
		
		
		
	}
	
	ResultSet gettable() {
		
		
		ps= con.createStatement();
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		return result;
	}






}














