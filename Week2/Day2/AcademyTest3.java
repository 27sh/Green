package day02;

public class AcademyTest {

	public static void main(String[] args) {
		
		int num = 5;
		Student[] arr = new Student[num];
		
		int korSum = 0, engSum = 0, mathSum = 0;
		float korAd = 0, engAd = 0, mathAd = 0;
		
		arr[0] = new Student(1, "홍길동", 80, 80, 80);
		arr[1] = new Student(2, "임꺽정", 50, 70, 60);
		arr[2] = new Student(3, "심청이", 40, 100, 90);
		arr[3] = new Student(4, "심봉사", 50, 80, 70);
		arr[4] = new Student(4, "심봉사", 50, 80, 70);

		
		for(Student stu : arr) {
			System.out.println("번호 : " + stu.getStdNum() + ", 이름 : " +stu.getName()+ ", 국어 : " +stu.getKor()+ ", 영어 : " +stu.getEng()+ ", 수학 : " +stu.getMath());
			korSum += stu.getKor();
			engSum += stu.getEng();
			mathSum += stu.getMath();
		}
		
		korAd = korSum / num;
		engAd = engSum / num;
		mathAd = mathSum / num;
		
		System.out.println();
		System.out.println("전체 국어 평균 : " +korAd+ ", 전체 영어 평균 : " +engAd+ ", 전체 수학 평균 : " +mathAd);
		System.out.println("---------------------");
	}

}
