package Excercise;

import java.util.Scanner;

public class Lab02_04 {
	
	public static void main(String[] args) {
		
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ----------------------------------------- ++");
		System.out.println("| 1. Giải phương trình bậc nhất              |"); 
		System.out.println("| 2. Giải phương trình bậc hai               |"); 
		System.out.println("| 3. Tính số tiền điện                       |"); 
		System.out.println("| 4. Kết thúc                                |"); 
		System.out.println("++ ------------------ ++");
		
		System.out.print("Lua chon cua ban: ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
		switch(a) {
		case 1:
			Lab02_01();
			break;
		case 2:
			Lab02_02();
			break;
		case 3:
			Lab02_03();
			break;
		default:
			System.out.print("Thoat chuong trinh");
			System.exit(0);
		}
		
		scanner.close();
	}
	

	public static void Lab02_01() {
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
	
	public static void Lab02_02() {
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
	
	public static void Lab02_03() {
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
