package jdbc.programs;

import java.sql.*;

public class Update {
	public static void update() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","srinivas","srinivas");
			
			PreparedStatement stmt=con.prepareStatement("update employee set lastname=? where age =?");
			
			
			int i=stmt.executeUpdate();
			if(i==1)
			{
			System.out.println("success");
			}
			else {
				System.out.println("fail");
			}
			/*sql="SELECT * FROM empdata";
			
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()) {
				String username=rs.getString("username");
				String password=rs.getString("password");
				String email=rs.getString("email");
				
				System.out.println("USERNAME:"+username);
				System.out.println("PASSWORD:"+password);
				System.out.println("EMAIL::::"+email);
			}
			rs.close();*/
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
