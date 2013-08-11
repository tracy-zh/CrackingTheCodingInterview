package com.zhangtian.myself.sorting_and_searching;

public class SelectSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {3,7,8,5,2,1,9,5,4};
		selectSort(arr);
		for(int i : arr) {
			System.out.print(i + ",");
		}
	}
	
	static void selectSort(int[] arr) {
		select(arr, 0);
	}
	
	static void select(int[] arr, int start) {
		if(start < arr.length - 1) {
			int min = findMinimum(arr, start);
			swap(arr, min, start);
			select(arr, start + 1);
		}
	}
	private static void swap(int[] arr, int i, int j) {
		if(i != j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;			
		}
	}
	private static int findMinimum(int[] arr, int start) {
		int min = start;
		for(int i = start + 1; i < arr.length; i++) {
			if(arr[i] < arr[min])
				min = i;
		}
		return min;
	}

}
