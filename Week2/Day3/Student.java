package day03;

public class Student {
	private String name;
	private int money;
	
	Student(){}

	Student(String name, int money){
		this.name = name;
		this.money = money;
	}
	
	public void studentInfo() {
		System.out.println("이름 : " +name+ ", 보유 돈 : " +money);
	}
	
	public void takeBus(Bus bus) {
		money -= 1500;
		bus.take(1500);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public int getMoney() {
		return money;
	}
}
