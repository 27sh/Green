package lamda;

public class Ex01_MemberInner {
	
	public static void main(String[] args) {
		Outer1 out = new Outer1();
		
		out.getMarine();
		
		Outer1.MemberInner1 inner = out.new MemberInner1();
		
		inner.move();
	}
}
