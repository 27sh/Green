package day04;

public class ATest {

	public static void main(String[] args) {
		
		System.out.println(A.staticVariable);
		
		A a = new A(10); // 기본 생성자 호출
		a.staticVariable= -1;
		
		A aa = new A(100);
		aa.staticVariable= -999;
		
		A aaa = new A(1000);
		aaa.staticVariable= -20000;
		
		System.out.println("static 참조 변수로 출력(a) : " + a.staticVariable);
		System.out.println("static 참조 변수로 출력(aa) : " + aa.staticVariable);
		System.out.println("static 참조 변수로 출력(aaa) : " + aaa.staticVariable);
		System.out.println("n : " + a.n);
		
		a.n = 20;
		System.out.println("n : " + a.n);
		
		// a.s = "홍길동"; 접근 제한자 private이 붙으면 직접 접근이 불가능하다.
		//System.out.println("s : " + a.s);
		
		a.setS("홍길동");
		System.out.println("s : " + a.getS()); // 홍길동
			
		System.out.println(a.toString());
		System.out.println(a);
	}

}
