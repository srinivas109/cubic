package first_jdbc_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserLogin2 extends UserLogin {
	public static void user2(){
try{
			
			Class.forName("org.h2.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/cubic","sa","");
			
			String sql="SELECT * FROM registration where username=? ";
			
			PreparedStatement stmt=con.prepareStatement(sql);
			
			
			/*ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()) {
				String username=rs.getString("username");
				String password=rs.getString("password");
				String email=rs.getString("email");
				
				System.out.println("USERNAME:"+username);
				System.out.println("PASSWORD:"+password);
				System.out.println("EMAIL::::"+email);
	}*/
}
catch(Exception e){
	e.printStackTrace();
}
	}
}
