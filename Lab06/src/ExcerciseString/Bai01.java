package ExcerciseString;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Username: ");
		String username = s.nextLine();
		System.out.print("Password: ");
		String password = s.nextLine();
		
		if(username.equals("hoidanit") && password.length()>6 ) {
			System.out.println("Valid");
		}else {
			System.out.println("Not Valid");
		}
		
		s.close();
	}
}
