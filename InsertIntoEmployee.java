package jdbc.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertIntoEmployee {
	public static void insertEmployee() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","srinivas","srinivas");
		
			PreparedStatement stmt=con.prepareStatement("insert into employee values (?,?,?,?)");
			
			Scanner s=new Scanner(System.in);
			System.out.println("enter the id number::");
			String id=s.nextLine();
			System.out.println("enter firstname::::::");
			String firstname=s.nextLine();
			System.out.println("enter lastname:::::::::");
			String lastname=s.nextLine();
			System.out.println("enter age:::::::::::");
			String age=s.nextLine();
			stmt.setString(1,id);
			stmt.setString(2,firstname);
			stmt.setString(3,lastname);
			stmt.setString(4,age);
			
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
