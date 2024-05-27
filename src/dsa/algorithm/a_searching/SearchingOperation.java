package dsa.algorithm.a_searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class SearchingOperation {
	public static void main(String[] args) {
		int[] arr = {10,9,4,6,2,3,1,8,5,4,7};
		binarySearchOperation(arr,7);
		binarySearchOperation(arr,1);
		binarySearchOperation(arr,10);
		binarySearchOperation(arr,11);
		binarySearchOperation(arr,0);

		//binarySearchOperation(arr,7);
		sortUsingComparitor(arr);
	}
	
	public static void binarySearchOperation(int[] arr,int target) {
		BinarySeach BS = new BinarySeach();
		Arrays.sort(arr);
		printIndex(BS.search(arr, 0, arr.length-1, target));
	}
	
	public static void printIndex(int index) {
		if(index == -1) {
			System.out.println("Element NOT FOUND...");
		}else {
			System.out.println("Element Present at Index : -> "+index);
		}		
	}
	
	public static void sortUsingComparitor(int[] arr) {
		
		List<Integer>  list = new ArrayList<>();		
		list.add(8);
		list.add(10);
		list.add(11);
		list.add(3);
		list.add(7);
		list.add(1);
		
		list.forEach(i->System.out.print(i+" "));
		System.out.println();
		System.out.println("Sorted in ASC order "+list.stream().sorted((num1,num2)->num1.compareTo(num2)).collect(Collectors.toList()));		
		System.out.println("Sorted in DESC order "+list.stream().sorted((num1,num2)->num2.compareTo(num1)).collect(Collectors.toList()));
		
		
	}
}
