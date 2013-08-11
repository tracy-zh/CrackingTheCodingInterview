package com.zhangtian.myself.recursion;

public class FibonacciGenerator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int test = 4;
		int[] output = generator(test); 
		for(int i = 0; i < test; i++){
			System.out.println(output[i]);
		}
	}

	static int fibonacci(int n) {
		if(n == 0)
			return 0;
		else if(n == 1) 
			return 1;
		else{
			return fibonacci(n - 1) + fibonacci(n - 2);			
		}
	}
	
	static int[] generator(int n) {
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = fibonacci(i + 1);
		}
		return arr;
	}
}
