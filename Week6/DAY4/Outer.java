
public class Outer {
	private int value = 10;
	
	class Inner{
		public void myMethod() {
			System.out.println("외부 클래스의 멤버 변수 값 : " +value);
		}
	}
	
	public Outer() {
		Inner inner = new Inner();
		inner.myMethod();
	}
}
