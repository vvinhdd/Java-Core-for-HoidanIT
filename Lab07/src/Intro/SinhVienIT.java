package Intro;

public class SinhVienIT extends SinhVien {
	
	private String language;
	private double scoreJava;
	private double scoreHTML;

	public SinhVienIT(String id, String name, double price, double tax, String language) {
		super(id, name, price, tax);
		this.language = language;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
	public double getScoreJava() {
		return scoreJava;
	}

	public void setScoreJava(double scoreJava) {
		this.scoreJava = scoreJava;
	}

	public double getScoreHTML() {
		return scoreHTML;
	}

	public void setScoreHTML(double scoreHTML) {
		this.scoreHTML = scoreHTML;
	}
	

	@Override
	double getDiem() {
		return (scoreJava * 2 + scoreHTML)/3;
		
	}


}
