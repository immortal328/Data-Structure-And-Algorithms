package dsa.data_structure.b_array;

public class Array {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		RotateArray rotateArray = new RotateArray();
		printArray(rotateArray.reverseArray(arr, 0, arr.length-1));		
	}
	
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
