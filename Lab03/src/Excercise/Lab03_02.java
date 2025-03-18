package Excercise;

import java.util.Scanner;

public class Lab03_02 {
	public static void main(String[] args) {
		System.out.println("Nhap vao mot so nguyen bat ky:");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap a: ");
		int a = scanner.nextInt();
		
		for(int i = 1; i<=10; i++) {
			System.out.printf("%d x %d = %d \n", a, i, a*i);
		}
		
		scanner.close();
	}
}
