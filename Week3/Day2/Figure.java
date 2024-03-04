package day10;

public class Figure {
	static double P = 3.141592;

	
	public static void main(String args[]) {
		Square s = new Square();
		Circle c = new Circle();
		Triangle t = new Triangle();
		
		s.draw();
		s.area(10, 10);
		
		c.draw();
		c.area(5);
		
		t.draw();
		t.area(10, 10);
	}
	
	public static void draw() {
		System.out.println("");
	}
	
	public static void area() {
		
	}
}
package day10;

public class Square extends Figure {
	int width;
	int height;
	
	public static void draw() {
		System.out.println("사각형을 그립니다.");
	}
	
	public static void area(int width, int height) {
		System.out.println("면적 : " +width * height);
	}
}
package day10;

public class Circle extends Figure {
	int radius;
	
	public static void draw() {
		System.out.println("원을 그립니다.");
	}
	
	public static void area(int radius) {
		System.out.println("면적 : " +radius * radius *Figure.P);
	}
}
package day10;

public class Triangle extends Figure{
	int width;
	int height;
	
	public static void draw() {
		System.out.println("삼각형을 그립니다.");
	}
	
	public static void area(int width, int height) {
		System.out.println("면적 : " +width * height / 2);
	}
}
