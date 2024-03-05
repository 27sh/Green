package printer;

public abstract class Printer {
	public abstract void print();
}
package printer;

public class BlackPrinter extends Printer {
	@Override
	public void print() {
		System.out.println("흑백 프린트");
	}
}
package printer;

public class ColorPrinter extends Printer {
	@Override
	public void print() {
		System.out.println("컬러 프린트");
	}
}
package printer;

public class MultiFunctionPrinter extends ColorPrinter implements Fax, Scanner{
	@Override
	public void print() {
		System.out.println("이중기능 프린터");
	}

	@Override
	public void copy() {
		// TODO Auto-generated method stub
		System.out.println("복사하다");
	}

	@Override
	public void scan() {
		// TODO Auto-generated method stub
		System.out.println("스캔하다");		
	}

	@Override
	public void send() {
		// TODO Auto-generated method stub
		System.out.println("팩스를 보내다");
	}

	@Override
	public void receive() {
		// TODO Auto-generated method stub
		System.out.println("팩스를 받다.");
	}
}
package printer;

public interface Fax {
	void send();
	
	void receive();
}
package printer;

public interface Fax {
	void send();
	
	void receive();
}
package printer;

public interface Fax {
	void send();
	
	void receive();
}
