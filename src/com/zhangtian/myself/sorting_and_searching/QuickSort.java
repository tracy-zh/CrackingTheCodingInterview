package com.zhangtian.myself.sorting_and_searching;

public class QuickSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {3,7,8,5,2,1,9,5,4};
		partition(arr, 0, arr.length - 1);
//		quickSort(arr, 0, arr.length - 1);
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + ",");
		}
	}
	
	static void quickSort(int[] arr, int i, int j) {
		int index = partition(arr, i, j);
		if(i < index - 1)
			quickSort(arr, i, index - 1);
		if(j > index)
			quickSort(arr, index, j);
	}

	private static int partition(int[] arr, int i, int j) {
		int pivot = arr[i];
		while(i <= j) {
			while(arr[i] < pivot){
				i++;				
			}
			while(pivot < arr[j]){
				j--;			
			}

			if(i <= j){
				swap(arr, i, j);
				i++;
				j--;
			}
		}
		return i;
	}
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;	
	}

}
