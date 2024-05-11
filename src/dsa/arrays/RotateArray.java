package dsa.arrays;

public class RotateArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		printArray(reverseArray(arr, 0, arr.length-1));

	}
	
	public static int[] reverseArray(int[] arr, int start, int end) {
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end]=temp;
			start++;end--;
		}
		return arr;		
	}
	
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
