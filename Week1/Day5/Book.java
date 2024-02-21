package day01;

public class Book {
	
	private String title;
	private String author;
	private int price;
	
	Book(){	}
	public Book(String title, String author, int price){

	}
	
	//1. setter
	void setPrice(int price) {
		this.price = price;
	}
	
	void setTitle(String title) {
		this.title = title;
	}
	
	void setAuthor(String author) {
		this.author = author;
	}
	
	//2. getter
	public int getPrice() {
		return price;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
}
