
public class OuterClass {
	private int num = 10;
	private static int sNum = 20;
	
	static class InStaticClass{
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			System.out.println("InstaticClass inNum = " +inNum+ "(내부클래스의 인스턴스 변수 사용)");
			System.out.println("InstaticClass sInNum = " +sInNum+ "(내부클래스의 정적 변수 사용)");
			System.out.println("OuterClass sNum = " +sNum+ "(외부클래스의 정적 변수 사용)");
		}
		
		static void sTest() {
			System.out.println("OuterClass sNum = " +sNum+ "(외부클래스의 정적 변수 사용)");
			System.out.println("InstaticClass sInNum = " +sInNum+ "(내부클래스의 정적 변수 사용)");
		}
	}
}
