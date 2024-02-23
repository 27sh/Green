package day01;

public class F1 {

	public F1() {}
	
	F2 f2 = new F2();
	
	public int mul(int n, int m) {
		int result = n * m;
		int re4 = f2.f2(result);
		
		return re4;
	}
}
