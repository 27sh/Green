package lamda;

public class Ex05_LambdaRule {
	
	interface Unit8{
		void move(String s);
	}
	
	
	public static void main(String[] args) {
		Unit8 unit;
		
		unit = (String s) -> {System.out.println(s); };
		unit.move("Lambda : 줄입 없는 표현");
		
		unit = (String s) -> System.out.println(s);
		unit.move("Lambda : 중괄호 생략");
		
		unit = (s) -> System.out.println(s);
		unit.move("Lambda : 매개변수 행 생략");
		
		unit = s -> System.out.println(s);
		unit.move("Lambda : 매개변수 소괄호 생략");
	}
}
