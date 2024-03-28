import java.util.Arrays;

public class MyArrays2 {

	private static int[] arr = {1, 2, 3, 4, 5};
	
	public static void main(String[] args) {
		int[] arr1 = Arrays.copyOf(arr, 2);
		int[] arr2 = Arrays.copyOf(arr, 7);
		
		System.out.print("arr1 : ");
		
		for(int i = 0;i <arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("arr2 : ");
		
		for(int i =0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		
		// copyOfRange(원본 배열, 시작인덱스, 끝인덱스) : 타겟배열반환
		
		int[] arr3 = Arrays.copyOfRange(arr, 1, 3);
		
		System.out.println();
		
		System.out.print("arr3 : ");

		
		for(int i = 0;i <arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
	}

}
