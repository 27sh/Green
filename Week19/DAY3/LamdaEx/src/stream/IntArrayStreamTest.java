package stream;

import java.util.Arrays;
import java.util.OptionalInt;

public class IntArrayStreamTest {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		
		int sumVal = Arrays.stream(arr).sum();
		int count = (int)Arrays.stream(arr).count();
		OptionalInt max = Arrays.stream(arr).max();
		OptionalInt min = Arrays.stream(arr).min();
	
		System.out.println(sumVal);
		System.out.println(count);
		System.out.println(max.getAsInt());
		System.out.println(min.getAsInt());
	}
}
