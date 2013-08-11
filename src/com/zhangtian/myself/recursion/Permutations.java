package com.zhangtian.myself.recursion;

public class Permutations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "abcd";
		permute(s);
	}
	
	public static void permute (String str) {
		boolean[] used = new boolean[str.length()];
		StringBuilder output = new StringBuilder();
		permutation(str, output, used);
	}

	static void permutation(String str, StringBuilder output, boolean[] used) {
		if(output.length() == str.length()) {
			System.out.println(output.toString());
			return;
		} else {
			for(int i = 0; i < str.length(); i++) {
				// Skip already used characters
				if(used[i]) continue;
				// Add fixed character to output and mark it used
				output.append(str.charAt(i));
				used[i] = true;
				//Permute over remaining characters
				permutation(str, output, used);
				//Remove fixed characters from output and unmark it.
				output.deleteCharAt(output.length() - 1);
				used[i] = false;
			}
		}
	}

}
