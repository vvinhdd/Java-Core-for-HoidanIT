package Excercise;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai01 {
	public static void main(String[] agrs) {
		
		Scanner s = new Scanner(System.in);
		ArrayList<Double> A = new ArrayList<Double>();
		
		System.out.println("Nhap phan tu tu ban phim");
		while(true){
			Double x = s.nextDouble();
			A.add(x);
			s.nextLine(); // hứng phím enter
			// Sử lý việc có nhập tiếp hay không
			System.out.print("Nhap them Y/N: ");
			String check = s.nextLine();
			if( check.equals("N") || check.equals("n") ){
				break;
			}
		}
		
		double Sum = 0;
		for( int i = 0; i < A.size(); i++) {
			Sum = Sum + A.get(i);
		}
		System.out.println("Tong cua ArrayList: " + Sum);
		
		s.close();
	}
}
