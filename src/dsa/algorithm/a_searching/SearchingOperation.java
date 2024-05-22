package dsa.algorithm.a_searching;

import java.util.Arrays;

public class SearchingOperation {
	public static void main(String[] args) {
		int[] arr = {10,9,4,6,2,3,1,8,5,4,7};
		binarySearchOperation(arr,7);
	}
	
	public static void binarySearchOperation(int[] arr,int target) {
		BinarySeach BS = new BinarySeach();
		Arrays.sort(arr);
		printIndex(BS.search(arr, 0, arr.length, target));
	}
	
	public static void printIndex(int index) {
		if(index == -1) {
			System.out.println("Element NOT FOUND...");
		}else {
			System.out.println("Index : ->"+index);
		}		
	}
}
