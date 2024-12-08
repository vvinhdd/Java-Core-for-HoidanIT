package Intro;

public class Student {
	
	// class attribute
	String name;
	int age;
	
	
	public Student() {
		
	}
	public Student(String name1, int age1) {
		this.name = name1;
		this.age = age1;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//class method
	public void learnJava() {
		System.out.println("Hello world");
	}
}
