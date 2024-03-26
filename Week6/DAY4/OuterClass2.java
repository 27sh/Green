
public class OuterClass2 {
	private int data = 30;
	
	void display() {
		final String msg = "현재의 데이터 값은 ";
		
		class Local{
			void printMsg() {
				System.out.println(msg + data);
			}
		}
		
		Local obj = new Local();
		obj.printMsg();
	}
}
