package Excercise;

import java.util.Scanner;

public class Lab03_01 {
	public static void main(String[] args) {
		System.out.println("Nhap vao mot so bat ky:");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap a: ");
		int a = scanner.nextInt();
		
		if(a==1) {
			System.out.println("Khong phai so nguyen to cung khong phai hop so");
		}
		else {
			boolean check_prime = false;
			for(int i = 2; i < a; i++ ) {
				if(a%i == 0) {
					check_prime = true;
					break;
				}
			}
			if (check_prime) {
				System.out.println("Khong phai so nguyen to");
			}
			else {
				System.out.println("La so nguyen to");
			}
		}
		
		scanner.close();
	}
}
