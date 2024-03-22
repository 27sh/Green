package generic;


public class BoxTest {

	public static void main(String[] args) {
		//ArrayList<String> list = new ArrayList<>();
		
		Box<String> b = new Box<>();
		
		b.setData("Hello world");
		String s = b.getData();
		
		System.out.println(s);
		
		Box<Integer> b1 = new Box<>();
		Integer n = 10;
		System.out.println(n);
	}

}
