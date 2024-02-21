package day01;

public class Test {

	public static void main(String[] args) {
		
		Book book1 = new Book();
		
		//setter 적용
		book1.setTitle("어린 왕자");
		book1.setAuthor("생택쥐페리");
		book1.setPrice(20000);
		
		System.out.println("책 제목 : " + book1.getTitle());
		System.out.println("저자 : " + book1.getAuthor());
		System.out.println("가격 : " + book1.getPrice());
		
		System.out.println("---------------------------------");
		/*
		Book book2 = new Book("Java", "James,", 10000);
		
		System.out.println("책 제목 : " + book2.title);
		System.out.println("저자 : " + book2.author);
		System.out.println("가격 : " + book2.price);
		*/
	}

}
