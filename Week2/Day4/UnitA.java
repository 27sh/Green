package day04;

public class UnitA {
	String type;
	int energy;
	
	UnitA(String type){
		this.type = type;
		energy = 10;
	}
	
	void decreaseEnergy() {
		energy -= 2;
	}
	
	@Override
	public String toString() {
		return "타입 : " +type+ ", 에너지 : " +energy;
	}
}
