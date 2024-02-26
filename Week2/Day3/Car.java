package day03;

public class Car {

	static int count;
	String prodNo; // p=1, p=2, p=3 ... 
	private String color;
	
	Car(){
		count++;
		prodNo = Integer.toString(count);
	}
	
	Car(String prodNo, String color){
		this.prodNo = prodNo;
		this.color = color;
	}
	
	public void setProdNo(String prodNo) {
		this.prodNo = prodNo;
	}
	
	public String getProdNo() {
		return prodNo;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	/*
	public void printCarName() {
		System.out.println(prodNo);
	}
	*/

}
