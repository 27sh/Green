interface Anony {
	int price = 2000;
	int discount = 500;
	
	public void salesInfo();
}


public class AnonyClass{
	public void printInfo() {
		new Anony() {
			@Override
			public void salesInfo() {
				System.out.println("정가 : " +price);
				System.out.println("할인가 : " +(price - discount));
			}
		}.salesInfo();
	}
}
