package ExcerciseRegularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BaitapRE {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("1. Kiem tra CCCD: ");
		System.out.println("2. Kiem tra Password: ");
		System.out.println("3. Kiem tra Email: ");
		System.out.println("Lua chon phuong thuc muon kiem tra: ");
		String option = s.nextLine();
		
		switch(option) {
			case "1":
				System.out.println("Nhap CCCD can kiem tra: ");
				String check1 = s.nextLine();
				checkCCCD(check1);
				break;
			case "2":
				System.out.println("Nhap Password can kiem tra: ");
				String check2 = s.nextLine();
				checkPassword(check2);
				break;
			case "3":
				System.out.println("Nhap Email can kiem tra: ");
				String check3 = s.nextLine();
				checkEmail(check3);
				break;
			default:
				System.out.println("Chua chon lua chon nao");
		}
		
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
