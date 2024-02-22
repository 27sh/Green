package day01;

class Add {
    private int[] arr;
    private int index;

    public Add(int size) {
        arr = new int[size];
        index = 0;
    }

    public void sum(int n) {
        if (index >= arr.length) {
            expandArr(); 
        }
        arr[index] = n;
        index++;
    }

    private void expandArr() {
        int newSize = arr.length + 3;
        int[] newArray = new int[newSize];
        
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        arr = newArray;
    }

    public int[] getArr() {
        return arr;
    }
}
