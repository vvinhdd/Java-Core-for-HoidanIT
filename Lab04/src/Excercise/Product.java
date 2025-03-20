package Excercise;

public class Product {
	
	private String name;
	private double price;
	private double tax;
	
	public Product() {
		
	}
	public Product(String name, double price, double tax) {
		this.name = name;
		this.price = price;
		this.tax = tax;
	}
	// Class method
	public Product nhapThongTin(String name, double price, double tax) {
		Product A = new Product( name, price, tax);
		return A;
	}
	public void xuatThongTin(Product product) {
		System.out.println("Name:" + product.getName() + " | Price:" + product.getPrice() + " | Tax:" + product.getTax());
	}
	public double getTaxPrice(Product a) {
		return a.price * a.tax;
	}
	//Getter & Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
}
