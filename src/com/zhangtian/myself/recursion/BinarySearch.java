package com.zhangtian.myself.recursion;

public class BinarySearch {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		BinarySearch b = new BinarySearch();
		int[] arr = {2,6,13,21,36,47,63,81,97};
		System.out.println(b.binarySearch(arr,23));

	}
	
	int binarySearch(int[] arr, int value) throws Exception {
		return binarySearch(arr, value, 0, arr.length - 1);
	}
	
	int binarySearch(int[] arr, int value, int lower, int upper) throws Exception {
		int range = upper - lower;
		int mid = (lower + upper) / 2;
		if(arr[lower] > arr[upper])
			throw new Exception("This is not a sorted array!");
		if(range == 0 && arr[lower] != value)
			throw new Exception("The values is not in the array!");
		if(arr[mid] < value)
			return binarySearch(arr, value, mid + 1, upper);
		else if(arr[mid] > value)
			return binarySearch(arr, value, lower, mid - 1);
		else
			return mid;
	}

}
