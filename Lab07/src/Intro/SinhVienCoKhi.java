package Intro;

public class SinhVienCoKhi extends SinhVien {
	
	private String skill;
	private double scoreCNC;
	private double scorePLC;

	public SinhVienCoKhi(String id, String name, double price, double tax, String skill) {
		super(id, name, price, tax);
		this.skill = skill;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public double getScoreCNC() {
		return scoreCNC;
	}

	public void setScoreCNC(double scoreCNC) {
		this.scoreCNC = scoreCNC;
	}

	public double getScorePLC() {
		return scorePLC;
	}

	public void setScorePLC(double scorePLC) {
		this.scorePLC = scorePLC;
	}
	

	@Override
	double getDiem() {
		return (scoreCNC + scorePLC)/2;
	}


}
