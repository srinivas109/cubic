package first_jdbc_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class SampleUser {
	public static void sample(){
		
		try{
			
			Class.forName("org.h2.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/cubic","sa","");
			
			Statement stmt=con.createStatement();
			
			ResultSet rs=stmt.executeQuery("select * from registration");
			
			while(rs.next()){
				//System.out.println("username : "+rs.getString(1)+"\npassword : "+rs.getString(2));
				
				Scanner s=new Scanner(System.in);
				System.out.println("Enter Username : ");
				String str=s.nextLine();
				
				if(str.equals(rs.getString(1))){
					
				System.out.println("Enter Password : ");
				String str1=s.nextLine();
				
				if(str1.equals(rs.getString(2))){
					
					System.out.println("login successfull...");
					
					int result=Integer.parseInt(rs.getString(4));
					
					if(result==1){
						System.out.println("your PROFILE : "+rs.getString(3));
					}
					else{	
					
					System.out.println("Waiting For Approval : ");
					}
				
			}else{
				System.out.println("invalid password");
			}
				}else{
					System.out.println("invalid username");
				}
			}
		}
			catch(Exception e){
				e.printStackTrace();
			}	
		
		
	}
}
