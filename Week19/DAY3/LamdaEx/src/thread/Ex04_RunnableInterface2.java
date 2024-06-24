package thread;

public class Ex04_RunnableInterface2 {
	
	public static void main(String[] args) {
		
		Runnable task1 = () -> {
			try {
				for(int i = 0; i < 10; i++) {
					System.out.println(i + " ");
					Thread.sleep(1000);
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		};
		
		Runnable task2 = () -> {
			try {
				for(int i = 9; i > 0; i--) {
					System.out.println("(" + i + " ) ");
					Thread.sleep(500);
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		};
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task1);
		
		t1.start();
		t2.start();
		
		System.out.println("main : " + Thread.currentThread().getName());
	}
}
