package thread;

class MyThread3 implements Runnable{
	
	@Override
	public void run() {
		
	}
}

public class Ex03_RunnableInterface {

	public static void main(String[] args) {
		Thread t = new Thread(new MyThread3());
		t.start();
	}

}
