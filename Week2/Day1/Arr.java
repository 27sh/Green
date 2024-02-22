package day01;

public class Arr {

	 public static void main(String[] args) {

		 int arraySize = 5;

	        Add add = new Add(arraySize);

	        add.sum(3);
	        add.sum(3);
	        add.sum(3);
	        add.sum(3);
	        add.sum(3);
	        add.sum(3);
	        add.sum(3);
	        add.sum(3);
	        add.sum(3);
	        add.sum(3);
	        

	        int[] mainArray = add.getArr();
	        System.out.print("배열 값: ");
	        for (int value : mainArray) {
	            System.out.print(value + " ");
	        }
	    }

}
