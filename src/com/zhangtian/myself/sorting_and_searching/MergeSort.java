package com.zhangtian.myself.sorting_and_searching;

public class MergeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {3,7,8,5,2,1,9,5,4};
		mergeSort(arr);
		//merge(arr, 0, (arr.length - 1) / 2,arr.length - 1);
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + ",");
		}
	}
	static void mergeSort(int arr[]) {
		mergeSort(arr, 0, arr.length - 1);
	}
	
	static void mergeSort(int arr[], int start, int end) {
		if(start < end) {
			int mid = (start + end) / 2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid + 1, end);
			merge(arr, start, mid, end);	
		}
	}
	static void merge(int arr[], int start,int mid, int end) {
		int[] helper = new int[arr.length];
		for(int i = start; i <= end; i++){
			helper[i] = arr[i];
		}
		
		int helperLeft = start;
		int helperRight = mid + 1;
		int current = start;
		
		while(helperLeft <= mid && helperRight <= end) {
			if(helper[helperLeft] <= helper[helperRight]) {
				arr[current] = helper[helperLeft];
				helperLeft++;
			} else {
				arr[current] = helper[helperRight];
				helperRight++;
			}
			current++;
		}
		
		for(int i = helperLeft; i <= mid; i++) {
			arr[current] = helper[i];
			current++;
		}		
	}
	

}
