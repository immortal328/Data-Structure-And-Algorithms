package dsa.data_structure.b_array;

public class RotateArray {
	
	/**
	 * This reverse array method we can use rotate array;
	 * just call this method time with different arguments
	 * 
	 * @param Array, startIndex, EndIndex
	 * @return Array : 
	 * */
	public int[] reverseArray(int[] arr, int start, int end) {
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end]=temp;
			start++;end--;
		}
		return arr;		
	}
}
