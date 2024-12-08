package Excercise;

import java.util.Scanner;

public class Lab02_01 {
	// tinh nghiem cho phuong trinh ax + b = 0
	public static void main (String[] args) {
		
		System.out.println("Tinh toan nghiem cho phuong trinh ax + b = 0");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap a: ");
		float a = scanner.nextFloat();
		System.out.println("Nhap b: ");
		float b = scanner.nextFloat();
		
		float x;
		
		if ( a==0 && b==0 ) {
			System.out.println("Phuong trinh co vo so nghiem");
		}
		else if (a==0  && b!=0) {
			System.out.println("Phuong trinh khong co nghiem thuc");
		}else {
			x = -b/a;
			System.out.println("Phuong trinh co mot nghiem: " + x);
		}
		
		scanner.close();
	}

}
