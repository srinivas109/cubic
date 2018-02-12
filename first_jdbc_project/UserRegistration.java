package first_jdbc_project;


import java.sql.*;
import java.util.*;

public class UserRegistration {
	public static void registration(){
		
		
		try{
			Class.forName("org.h2.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/cubic","sa","");
			
			PreparedStatement stmt=con.prepareStatement("insert into registration values(?,?,?,?)");
			
			
			
			Scanner s=new Scanner(System.in);
			System.out.println("Enter username : ");
			String username=s.nextLine();
			System.out.println("Enter password : ");
			String password=s.nextLine();
			System.out.println("Enter Email :::: ");
			String email=s.nextLine();
			String status="0";
			stmt.setString(1,username);
			stmt.setString(2,password);
			stmt.setString(3,email);
			stmt.setString(4,status);
			
			int i=stmt.executeUpdate();
			
			if(i==1){
				System.out.println("Registration Done Successfully  \nPlease Wait For Admin Approval...");
			}else{
				System.out.println("not success");
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
