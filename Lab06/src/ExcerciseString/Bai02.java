package ExcerciseString;

import java.util.ArrayList;

public class Bai02 {
	
//	public class Student{
//		String name;
//		String id;
//	}
	
	public static void main(String[] agrs) {
		Student A1 = new Student("Tran Dong Khang","001");
		Student A2 = new Student("Nguyen Thi Hai","002");
		Student A3 = new Student("Nguyen Thi Ba","003");
		Student A4 = new Student("Nguyen Thi Bon","004");
		Student A5 = new Student("Nguyen Thi Nam","005");
		
		ArrayList<Student> arr = new ArrayList<Student>();
		arr.add(A1);
		arr.add(A2);
		arr.add(A3);
		arr.add(A4);
		arr.add(A5);
		
		for(int i = 0; i < arr.size(); i++) {
			//System.out.println(arr.get(i).toString());
			if(arr.get(i).getName().startsWith("Nguyen")) {
				System.out.println(arr.get(i).toString());
			}
		}
		
	}

}
