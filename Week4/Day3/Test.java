package exception;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		try {
			for(int i = 0; i < arr.length + 1; i++) {
				arr[i] = i;
				System.out.println("arr[" +i+ "] = " +i);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.err.println("배열을 초과하였습니다.");
		}
	
	}
	
	public static void div(int a, int b) {
		Scanner sc = new Scanner(System.in);
		try {
			float result = a / b;
			System.out.println(result);
		}
		catch(ArithmeticException e) {
			System.err.println("0으로는 나눌 수 없습니다.");
		}
		finally {
			sc.close();
		}
	}

}
