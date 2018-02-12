package first_jdbc_project;

import java.util.*;

public class MainTest {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1.ADMIN LOGIN"+"\n2.USER LOGIN"+"\n3.USER REGISTRATION"+"\nEnter Your Choice : ");
		int i=sc.nextInt();
		
		
		switch(i){
		
		case 1:AdminLogin.admin();
		break;
		
		case 2:UserLogin.user();
		break;
		
		case 3: UserRegistration.registration();
		break;
		}
		
		

	}

}
