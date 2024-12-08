package Excercise;

import java.util.Scanner;

public class Lab02_03 {
	// tinh tien dien
	public static void main(String[] args) {
		System.out.println("Nhap vao so dien: ");
		Scanner scanner = new Scanner(System.in);
		int soDien = scanner.nextInt();
		
		int money;
		
		if ( soDien <= 100) {
			money = soDien*1000;
			System.out.println("So tien dien can phai dong la: " + money);
		} else {
			money = (soDien - 100)*1500 + 100*1000;
			System.out.println("So tien dien can phai dong la: " + money);
		}
		
		scanner.close();
	}
}
