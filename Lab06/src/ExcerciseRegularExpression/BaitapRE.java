package ExcerciseRegularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BaitapRE {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Nhap CCCD can kiem tra: ");
		String check = s.nextLine();
		
		// System.out.println(check.length()); // 123456789102
		//checkCCCD(check);
		//checkPassword(check);
		checkEmail(check);
		
		s.close();
	}
	
	public static void checkCCCD(String x) {
		Pattern p1 = Pattern.compile("\\d{12}");
		Matcher m1 = p1.matcher(x);
		boolean mathFound = m1.find();
		if (mathFound) {
			System.out.println("Valid");
		}else {
			System.out.println("Not Valid");
		}
		
	}
	public static void checkPassword(String x) {
		Pattern p2 = Pattern.compile(".{6}");
		Matcher m2 = p2.matcher(x);
		boolean mathFound = m2.find();
		if (mathFound) {
			System.out.println("Valid");
		}else {
			System.out.println("Not Valid");
		}
	}
	public static void checkEmail(String x) {
		Pattern p3 = Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$");
		Matcher m3 = p3.matcher(x);
		boolean mathFound = m3.find();
		if (mathFound) {
			System.out.println("Valid");
		}else {
			System.out.println("Not Valid");
		}
		
	}
}
