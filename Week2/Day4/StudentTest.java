spackage day04;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student.sayHello();
		
		Student s01 = new Student("홍길동");
		Student s02 = new Student("임꺽정");
		Student s03 = new Student("일지매");
		
		System.out.println(s01);
		System.out.println(s02);
		System.out.println(s03);
		
		System.out.println(Student.cnt);
	}a

}
