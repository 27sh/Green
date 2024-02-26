package day03;

public class Bus {
	private int busNo; // 필수 데이터 > 인스턴스화 될 때 부여받아야 함.
	private int cousNum;
	private int bringMoney;
	static int cnt;
	
	public Bus() {
		cnt++;
		busNo = cnt * 100;
	}
	
	public void busInfo() {
		System.out.println("버스 번호 : " + busNo + ", 승객 수 : " +cousNum+ ", 번 돈 : " +bringMoney);
	}
	
	public void take(int fee) {
		cousNum ++;
		bringMoney += fee;
	}
	
	public void out() {
		cousNum--;
	}
	
	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}
	
	public int getBusNo() {
		return busNo;
	}
	
	public void setCousNum(int cousNum) {
		this.cousNum = cousNum;
	}
	
	public int getCousNum() {
		return cousNum;
	}
	
	public void setBringMoney(int bringMoney) {
		this.bringMoney = bringMoney;
	}
	
	public int getBringMoney() {
		return bringMoney;
	}
}
