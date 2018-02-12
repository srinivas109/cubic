package first_jdbc_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class AdminLogin2 {
	public static void show2(){
		try{
			Class.forName("org.h2.Driver");

			Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/cubic","sa","");
	
			PreparedStatement stmt=con.prepareStatement("update registration set status=1 where username=?");
			
			Scanner s=new Scanner(System.in);
			//System.out.println("enter username : ");
			String username=s.nextLine();
			stmt.setString(1,username);
			int i=stmt.executeUpdate();
			System.out.println("Approval success...");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
