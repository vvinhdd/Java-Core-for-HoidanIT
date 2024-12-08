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
		System.out.println("111111111111111");
	}
	
	public static void Lab02_02() {
		System.out.println("222222");
	}
	
	public static void Lab02_03() {
		System.out.println("333");
	}
}
