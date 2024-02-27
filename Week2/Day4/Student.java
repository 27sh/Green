package day04;

public class Student {
	static int cnt;
	int sno;
	String name;
	
	Student(String name){
		sno = cnt++;
		this.name = name;
	}
	
	public static void sayHello() {
		System.out.println("Hello~ My name is ");
	}
	
	@Override
	public String toString() {
		return sno + ", " +name;
	}
}
