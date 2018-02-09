package jdbc.programs;

import java.sql.*;

public class CreateTable {
	public static void create() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","srinivas","srinivas");
			
			Statement stmt=con.createStatement();
			
			String sql="CREATE TABLE EMPLOYEE"+"(ID INTEGER NOT NULL,"+"FIRSTNAME VARCHAR(255),"+"LASTNAME VARCHAR(255),"+"AGE INTEGER,"
					+ "PRIMARY KEY(ID))";
			
			stmt.executeUpdate(sql);
			System.out.println("success");
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
