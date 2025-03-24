package Intro;

public abstract class SinhVien {
	
	protected String id;
	protected String name;
	protected double price;
	protected double tax;
	
	abstract double getDiem();
	
	public SinhVien(String id, String name, double price, double tax) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.tax = tax;
	}
	
//	public String toString() {
//		return "SinhVien [id=" + id + ", name=" + name + ", price=" + price + ", tax=" + tax + "]";
//	}

	public double getPriceTax() {
		return price*tax;
	}

}
