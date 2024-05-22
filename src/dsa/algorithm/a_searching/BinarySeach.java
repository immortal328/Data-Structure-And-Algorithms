package dsa.algorithm.a_searching;

/**
 * Binary Search is useful to fine out Element Index in side array its time
 * complexity is LogN.
 */
public class BinarySeach {
	int search(int[] arr, int start, int end, int target) {
		while (start <= end) {
			int middle = (start + end) / 2;
			if (arr[middle] == target) {
				return middle;
			} else if (arr[middle] > target) {
				end = middle - 1;
			} else {
				start = middle + 1;
			}
		}
		return -1;
	}
}
