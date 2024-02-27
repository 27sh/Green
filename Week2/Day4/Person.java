package day04;

public class Person {
	String name;
	String gender;
	int age;
	
		public void	print1() {
			System.out.println("이름 : " +name);
			System.out.println("성별 : " +gender);
			System.out.println("나이 : " +age);
		}
		
		public static void main(String[] args) {
			Korea kor = new Korea("홍길동", "남", 20, 0000000000);
			kor.print1();
			kor.print();
		}
}

public class Korea extends Person {
	int num;
	
	Korea(String name, String gender, int age, int num){
		super.name = name;
		super.gender = gender;
		super.age = age;
		this.num = num;
	}
	
	public void print() {
		System.out.println("주민등록번호 : " +num);
	}
}
