package day04;

public class UnitB {
	String type;
	int energy;
	
	UnitB(String type){
		this.type = type;
		energy = 10;
	}
	
	public void attack(UnitA a){
		a.decreaseEnergy();
	}
}
