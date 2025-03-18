package Excercise;

import java.util.Arrays;
import java.util.Scanner;

public class Lab03_03 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    System.out.print("Enter the number of size of array: ");
	    int size = sc.nextInt();
	    int[] a = new int[size];
	    System.out.println("Enter the array element: ");
	    //For reading the element
	    for(int i=0;i<size;i++) {
	        a[i] = sc.nextInt();
	    }
	    //For print the array element
	    System.out.println(Arrays.toString(a));
	    
	    Arrays.sort(a);
	    System.out.println(Arrays.toString(a));
	    
	    System.out.printf("Min value: %d\n", a[0]);
	    System.out.printf("Max value: %d\n", a[a.length - 1]);
//	    
//	    for(int i : a) {
//	        System.out.print(i+" ,");
//	    }
	}
}
