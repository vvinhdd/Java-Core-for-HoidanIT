package Intro;

import java.util.Scanner;

public class SelectionFunction {
	public static void main (String[] args) {
		System.out.println(">>Lựa chọn tính năng <<");
		System.out.println("++ ------------------ ++");
		System.out.println("| 1. Cộng              |");
		System.out.println("| 2. Trừ               |");
		System.out.println("| 3. Kết thúc          |");
		System.out.println("++ ------------------ ++"); 
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Lựa chọn của bạn là : ");
		
		int value = scanner.nextInt();
		
		switch (value) {
		case 1:
			System.out.println("Bạn đã lựa chọn phép cộng");
			break;
		case 2:
			System.out.println("Bạn đã lựa chọn phép trừ");
			break;
		default:
			System.out.println("Bạn đã chọn thoát chương trình");
			System.exit(0);
		}
		
		scanner.close();
	}
}
