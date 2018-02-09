package jdbc.programs;


import java.sql.*;
import java.util.Scanner;

public class Insert {
	
	public static void insert() {
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","srinivas","srinivas");
	
		PreparedStatement stmt=con.prepareStatement("insert into empdata values (?,?,?)");
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the username::");
		String Username=s.nextLine();
		System.out.println("enter password::::::");
		String Password=s.nextLine();
		System.out.println("enter email:::::::::");
		String Email=s.nextLine();
		stmt.setString(1,Username);
		stmt.setString(2,Password);
		stmt.setString(3,Email);
		
		int i=stmt.executeUpdate();
		
		if(i==1) {
			System.out.println("success");
		}
	}

	catch(Exception e)
	{
	e.printStackTrace();	
	}
}
}
	


