package dsa.algorithm.b_sorting;

public class BubbleSort {
	public int[] sort(int[] arr) {		
		for(int i =0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] > arr[j]) {
					swap(arr, i, j);					
				}				
			}
		}
		return arr;
	}
	
	void swap(int[] arr, int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;		
	}

}
