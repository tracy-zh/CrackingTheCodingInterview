package com.zhangtian.myself.math;

import java.util.ArrayList;
import java.util.Arrays;

public class Prime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Prime p = new Prime();
		System.out.println(p.sieveOfEratosthenes(10));

	}
	
	//Looking for all primes before n
	String sieveOfEratosthenes(int n){
		boolean[] flag = new boolean[n + 1];
		StringBuilder a = new StringBuilder();
		Arrays.fill(flag, true);
		
		if(n < 2) {
			return null;
		} else {
			for(int i = 2; i <= n; i ++){
				if(flag[i] == true) {
					for(int j = i; j * i <= n; j++)
						flag[i * j] = false;
				}
			}
		}
		for(int m = 2; m < flag.length; m++) {
			if(flag[m]) {
				a.append(m);
			}
		}
		return a.toString();
		
		
	}
}

