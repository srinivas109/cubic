package first_jdbc_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class UserLogin {
	public static void user(){
		try{
			
			Class.forName("org.h2.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/cubic","sa","");
			
			Statement stmt=con.createStatement();
			
			ResultSet rs=stmt.executeQuery("select * from registration");
			
			while(rs.next()){
				
				boolean i;
				if(i=(rs.getInt(4))!=0){
					System.out.println("welcome...");
					Scanner s=new Scanner(System.in);
					System.out.println("Enter Username : ");
					String str=s.nextLine();
					
					if(str.equals(rs.getString(1))){
						
					System.out.println("Enter Password : ");
					String str1=s.nextLine();
					
					if(str1.equals(rs.getString(2))){
						
						System.out.println("login successfull...");
						UserLogin2.user2();
					System.out.println("success...");
				}
					}else{
						System.out.println("Waiting For approval...");
					}
				}
	}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
