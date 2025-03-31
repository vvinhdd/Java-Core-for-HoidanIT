package Excercise;

import java.util.Scanner;

public class Baitap {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static class RangeException extends Exception {
	    public RangeException(String message) {
	        super(message);
	    }
	}
	
	public static void checkRangeDiem(double number, double min, double max) throws RangeException {
		if (number < min || number > max) {
            throw new RangeException("Số " + number + " không thuộc khoảng từ " + min + " đến " + max + ".");
        }
	}
	
	public static void checkRangeAge(int age2, int min2, int max2) throws RangeException {
		if (age2 < min2 || age2 > max2) {
            throw new RangeException("Số " + age2 + " không thuộc khoảng từ " + min2 + " đến " + max2 + ".");
        }
	}
	
	public static double nhapDiem() {
		
		while(true) {
			try {
				System.out.print("Nhap thu so diem: ");
				double diem = scanner.nextDouble();
				scanner.nextLine();
	            checkRangeDiem(diem, 0, 10); // Kiểm tra xem số có thuộc khoảng từ 0 đến 10 không
	            System.out.println("Số " + diem + " nằm trong khoảng.");
	            System.out.println("----Hoan thanh Nhap Diem----");
	            return diem;
	        } catch (RangeException e) {
	            System.out.println(e.getMessage());
	        }
		}
		
	}
	
	public static int nhapAge() {
		
		while(true) {
			try {
				System.out.print("Nhap thu so age: ");
				int age = scanner.nextInt();
				scanner.nextLine();
				checkRangeAge(age, 18, 100); // Kiểm tra xem số có thuộc khoảng từ 18 đến 100 không
				System.out.println("Số " + age + " nằm trong khoảng.");
				System.out.println("----Hoan thanh Nhap Age----");
				return age;
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
		}
		
	}
	
	public static void main (String[] args) {
		
		nhapDiem();
		nhapAge();
		
		scanner.close();
	}

}
