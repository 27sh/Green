package generic;

public class Plastic extends Material {
	public void doPrinting() {
		System.out.println("Plastic으로 프린트합니다.");
	}
	
	@Override
	public String toString() {
		return "Plastic";
	}
	
}
