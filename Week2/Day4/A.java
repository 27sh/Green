package day04;

public class A {

	static int staticVariable = 100;
	int n;
	private String s;
	
	//A(){}
	
	/*생성자의 역할
	 1. 객체를 생성해준다. (인스턴스를 만들어 준다.)
	 2. 멤버 변수의 값을 설정해준다. (초기화 한다.)
	*/
	
	A(int n){ // 생성자의 매개변수 이름은 멤버변수 이름과 동일하게 쓴다.
		this.n = n; // 양 변의 변수 이름이 같으므로 멤버 변수의 이름을 분명히 하려고 이름을 붙인다.
	}
	
	void setS(String s) { // 멤버 변수 s에 대한 세터 메서드
		this.s = s;
	}
	
	String getS() { // 멤버 변수 s에 대한 전용 게터 메서드
		return s;
	}
	
	/*
	@Override
	public String toString() {

		return "n : " +n+ ", s : " +s;
	}
	*/
}
