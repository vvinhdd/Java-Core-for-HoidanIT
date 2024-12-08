package Intro;

import java.util.Arrays;

public class LearnArray {
	
	public static void main(String[] args) {
		
		String[] club = {"Hello", "Hi", "No"};
		System.out.println("Tao mot array: " + Arrays.toString(club));
		System.out.println("Chieu dai cua chuoi: " + club.length);
		
		for(int i=0; i < club.length ; i++) {
			System.out.println(club[i]);
		}
		
		System.out.println("-------------------------");
		String[] a = new String[4];
		a[0] = "15";
		System.out.println("Array A: " + Arrays.toString(a));
	}
}
 