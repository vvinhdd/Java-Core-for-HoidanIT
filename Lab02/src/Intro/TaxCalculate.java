package Intro;

import java.util.Scanner;

public class TaxCalculate {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhap vao so tien: ");
		int money = scanner.nextInt();
		float tax;
		
		if( money < 10) {
			System.out.println("Khong dong thue");
		} else if( money >= 10 && money <= 15) {
			tax = money * 0.1f;
			System.out.println("Thue 10%: " + tax);		
		} else if( money > 15 && money <= 30){
			tax = money * 0.2f;
			System.out.println("Thue 20%: " + tax);
		} else {
			tax = money * 0.5f;
			System.out.println("Thue 50%: " + tax);
		}
		
		scanner.close();
	}
}
