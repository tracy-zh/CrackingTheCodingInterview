/*
 * 2.	Write an efficient function that deletes characters from an ASCII string. Use the prototype string removeChars(string str, string remove);
Slo: a) Setup a lookup ASCII array to false. b) Set the char which hope to be removed to true. c) iterate through string, update each char to new string.

 */
package com.zhangtian.myself.array;

public class RemoveChars {

	/**
	 * @param args
	 */
	static String str = "You are my sunshine, my only sunshine. You make me happy, when skies are blue.";
	static String remove = "aeiou";
	public static void main(String[] args) {
		System.out.println(removeChars(str, remove));
	}
	
	public static String removeChars(String str, String remove) {
		char[] s = str.toCharArray();
		char[] r = remove.toCharArray();
		int i, j = 0;
		
		boolean[] flag = new boolean[128];
		for(i = 0; i < r.length; i++){
			flag[r[i]] = true;
		}
		
		for(i = 0; i < s.length; i++) {
			if(!flag[s[i]]){
				s[j] = s[i];
				j++;		
			}
		}
		return new String(s, 0, j);			
	}
}
