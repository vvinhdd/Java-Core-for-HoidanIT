package Intro;

public class BaiTap01 {
	
	public static void main (String[] args) {
		
		SinhVienIT S1 = new SinhVienIT("001", "Vinh 1", 3000, 10, "Java");
		System.out.println("Name: " + S1.name);
		S1.setScoreHTML(10);
		S1.setScoreJava(7);
		System.out.println(S1.getDiem());
		
		SinhVienCoKhi S2 = new SinhVienCoKhi("002", "Vinh 2", 3000, 10, "Smash");
		System.out.println("Name: " + S2.name);
		S2.setScoreCNC(8);
		S2.setScorePLC(9);
		System.out.println(S2.getDiem());
		
	}

}
