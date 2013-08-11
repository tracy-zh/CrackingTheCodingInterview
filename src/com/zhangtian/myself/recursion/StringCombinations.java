package com.zhangtian.myself.recursion;

public class StringCombinations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		combine("abc");
	}
	
	static void combine(String str) {
		StringBuilder output = new StringBuilder();
		combination(str, output, 0);
	}
	
	static void combination(String str, StringBuilder output, int allowedStart){
		if(allowedStart == str.length())
			return;
		else {
			for(int current = allowedStart; current < str.length(); current++) {
				//add allowed char into the stringbuilder
				output.append(str.charAt(current));
				// print the output
				System.out.println(output);
				//Recursive for the next position
				combination(str, output, current + 1); // why not allowedStart + 1: 
				//delete the buffer;
				output.deleteCharAt(output.length() - 1);
			}
		}
		
	}
}
