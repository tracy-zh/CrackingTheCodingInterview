package com.zhangtian.myself.sorting_and_searching;

public class InsertSort {

	
	public static void main(String[] args) {
		int[] arr = {3,7,8,5,2,1,9,5,4};
		insertSort(arr);
		for(int i : arr) {
			System.out.print(i + ",");
		}
	}
	static void insertSort(int[] arr) {
		for(int current = 1; current < arr.length; ++current) {
			int value = arr[current];
			for(int i = 0; i < current; ++i) {
				if(arr[i] > value) {
					System.arraycopy(arr, i, arr, i + 1, current - i);
					arr[i] = value;
					break;
				}
			}
		}
	}
}
