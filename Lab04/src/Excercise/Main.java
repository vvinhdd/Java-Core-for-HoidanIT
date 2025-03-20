package Excercise;

public class Main {
	
	public static void main(String[] args) {
		
		Product Pr = new Product();
		Product A1 = new Product("Laptop", 2000, 15);
		Product A2 = Pr.nhapThongTin("PC", 5000, 10);
		
		//System.out.println(A1.getName());
		//System.out.println(A2.getName());
		
		Pr.xuatThongTin(A1);
		Pr.xuatThongTin(A2);
		double cal_tax = Pr.getTaxPrice(A2);
		System.out.println("Tax calculater: " + cal_tax);
	}
	
}
