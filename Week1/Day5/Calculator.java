package day01;

public class Calculator {

	public static void main(String[] args) {
		
		Option option = new Option();
		
		int n1 = 10;
		int n2 = 5;
		
		int result1 = option.add(n1, n2);
		int result2 = option.dev(n1, n2);
		int result3 = option.mul(n1, n2);
		float result4 = option.div((float)n1, (float)n2);
		
		System.out.println(n1 + " + " + n2 + " = " + result1);
		System.out.println(n1 + " - " + n2 + " = " + result2);
		System.out.println(n1 + " * " + n2 + " = " + result3);
		System.out.println(n1 + " / " + n2 + " = " + result4);

	}

}
