package first_jdbc_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AdminLogin1 {
	public static void show(){
		
		try{
		Class.forName("org.h2.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/cubic","sa","");
		
		Statement stmt=con.createStatement();
		
		ResultSet rs=stmt.executeQuery("select username from registration where status=0");
		
		while(rs.next()){
			System.out.println("username : "+rs.getString(1));
	}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
}
}