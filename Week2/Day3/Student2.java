package day03;

public class Student {
	private String name;
	private int money;
	static int cnt;
	private int stdNo;
	
	// static int io = 0; // 버스에 탄 상태라면 1, 아니라면 0
	
	Student(){}

	Student(String name, int money){
		this.name = name;
		this.money = money;
		
		cnt++;
		stdNo = cnt;
	}
	
	public void studentInfo() {
		System.out.println("학생 번호 : " +stdNo+ ", 이름 : " +name+ ", 보유 돈 : " +money);
	}
	
	public void takeBus(Bus bus) {
		money -= 1500;
		bus.take(1500);
		//io = 1;
	}
	
	public void outBus(Bus bus) {
		bus.out();
		//io = 0;
	}
	
	public void setStdNo(int stdNo) {
		this.stdNo = stdNo;
	}
	
	public int getStdNo() {
		return stdNo;
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
