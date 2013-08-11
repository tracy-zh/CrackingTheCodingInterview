package com.zhangtian.myself.sorting;

import java.util.Arrays;


public class MergeSort {
	/**
	 * @author : tracy
	 * @data: 2013-2-24
	 * @note: Quicksort
	 */
	public static void main(String args[]) {
		int[] arr = {49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};	
		MergeSort m = new MergeSort();
		m.mergeSort(arr, 0, arr.length-1);
		//System.out.println(Arrays.toString(arr));
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	void mergeSort(int[] arr, int low, int high) {
		if(low < high) {
			int mid = (low + high)/2;
			mergeSort(arr, low, mid);
			mergeSort(arr, mid + 1, high);
			merge(arr, low, mid, high);
		}
	}
	
	void merge(int[] arr, int low, int mid, int high) {
		int[] helper = new int[arr.length];
		int left = low;
		int right = mid + 1;
		int current = low;
		
		for(int i = low; i <= high; i++) {
			helper[i] = arr[i];
		}
		
		while(left <= mid && right <= high) {
			if(helper[left] <= helper[right]) {
				arr[current] = helper[left];
				left++;
			}
			else{
				arr[current] = helper[right];
				right++;
			}
			current++;
		}
		
		int remaining = mid - left;
		for(int i = 0; i <= remaining; i++){
			arr[current + i] = helper[left + i];
		}
	}
}