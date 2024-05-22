package dsa.algorithm.b_sorting;

public class SortingOperation {
	public static void main(String[] args) {
		int[] arr = {10,9,4,6,2,3,1,8,5,4,7};
		BubbleSortOperation(arr);
	}
	
	public static void BubbleSortOperation(int[] arr) {
		BubbleSort bubbleSort = new BubbleSort();
		printSortedArray(bubbleSort.sort(arr));
	}	
	
	public static void printSortedArray(int[]  arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");		
		}
		System.out.println();
	}
}
