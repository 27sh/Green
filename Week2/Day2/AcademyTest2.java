package day02;

public class AcademyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student = new Student(1, "홍길동", 80, 80, 80);
		
		/*
		student.setStdNum(1);
		int stdNum = student.getStdNum();
		
		student.setName("홍길동");
		String name = student.getName();
		
		student.setMath(100);
		int math = student.getMath();
		
		student.setKor(90);
		int kor = student.getKor();
		
		student.setEng(80);
		int eng = student.getEng();
		*/
		
		System.out.println(student.showInfo());
		  
		//System.out.println(stdNum + ", " + name + ", " + math + ", " + kor + ", " + eng);
		/*
		student.name = "홍길동";
		student.kor = 90;
		student.eng = 60;
		student.math = 70;
		
		Student student1 = new Student();
	
		student1.stdNum = 2;
		student1.name = "임꺽정";
		student1.kor = 100;
		student1.eng = 50;
		student1.math = 30;
		
		System.out.println(student.stdNum + ", " +student.name );
		System.out.println(student1.stdNum + ", " +student1.name );
		
		Student student3 = new Student(3, "James");
		System.out.println(student3.stdNum + ", " + student3.name);
		*/
	}

}
