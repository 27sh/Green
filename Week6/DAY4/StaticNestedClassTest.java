
public class StaticNestedClassTest {

	public static void main(String[] args) {
		OuterClass.InStaticClass sInClass = new OuterClass.InStaticClass();
		System.out.println("정적 내부 클래스 일반 메소드 호출");
		sInClass.inTest();
		
		System.out.println();
		
		System.out.println("정적 내부 클래스 정적 메소드 호출");
		OuterClass.InStaticClass.sTest();
	}

}
