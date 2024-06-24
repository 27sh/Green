package lamda;

interface Unit6{
	void move(String s);
}

public class Ex04_Lambda {
	
	public static void main(String[] args) {
		
		Unit6 unit = (String s) -> {
				System.out.println(s);
		};
		
		unit.move("annoymous : Unit 6....");
	}
}
