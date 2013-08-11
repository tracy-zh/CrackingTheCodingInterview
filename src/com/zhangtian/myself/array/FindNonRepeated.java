/*************************************************
 * 1.	Write an efficient function to find the first non-repeated character in a string. Ex. ¡±total¡± is ¡®o¡¯, ¡°teeter¡± is ¡®r¡¯.
Sol: a) Build a hash table. For each character in the String: if table not contains it, store 1; if contains, add 1
b) Scan the string. If char in hash table is 1, return that char; if no 1 in hash table, return null.

 ************************************************/
package com.zhangtian.myself.array;

import java.util.HashMap;

public class FindNonRepeated {

	static String s = "teetercd";
	
	public static void main(String[] args) {
		
		System.out.println(fisrtNonRepeated(s));
	}

	public static Character fisrtNonRepeated(String str) {
		HashMap<Character, Integer> charHash = new HashMap<Character, Integer>();
		int i, length;
		Character c;
	
		length = str.length();
		// Scan str, building hash table
		for (i = 0; i < length; i++) {
			c = str.charAt(i);
			if(charHash.containsKey(c)) {
				// Increment count corresponding to c
				charHash.put(c, charHash.get(c) + 1);
			}
			else {
				charHash.put(c, 1);
			}
		}

	
		// Search hash table in order of str
		for (i = 0; i < length; i++) {
			c = str.charAt(i);
			if (charHash.get(c) == 1)
				return c;
		}
		return null;	
	}
	
}