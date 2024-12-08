package Excercise;

import java.util.Scanner;

public class Lab02_02 {
	public static void main(String[] args) {
		// tinh nghiem cho phuogn trinh bac 2
		System.out.println("Tinh toan nghiem cho phuong trinh ax2 + bx + c = 0");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap a: ");
		float a = scanner.nextFloat();
		System.out.println("Nhap b: ");
		float b = scanner.nextFloat();
		System.out.println("Nhap c: ");
		float c = scanner.nextFloat();
		
		if(a==0) {
			if ( b==0 && c==0 ) {
				System.out.println("Phuong trinh co vo so nghiem");
			} else if (b==0  && c!=0) {
				System.out.println("Phuong trinh khong co nghiem thuc");
			} else {
				float x = -c/b;
				System.out.println("Phuong trinh co mot nghiem: " + x);
			}
		} else {
			float delta = b*b - 4*a*c;
			if( delta < 0) {
				System.out.println("Phuong trinh vo nghiem");
			} else if( delta == 0 ) {
				float x = -b/(2*a);
				System.out.println("Phuong trinh co nghiem kep: " + x);
			} else {
				double x1 = (-b + Math.sqrt(delta)) / (2*a);
				double x2 = (-b - Math.sqrt(delta)) / (2*a);
				System.out.println("Phuong trinh co 2 nghiem: " + x1 + " , " + x2);
			}
		}
		
		scanner.close();
	}
}
