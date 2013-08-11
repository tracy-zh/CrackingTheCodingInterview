package com.zhangtian.myself.array;

import java.util.Stack;

public class ReverseWord {

	static String str = "Jerry is so cute.";
	public static void main(String[] args) {
		System.out.println(reverse(str));

	}
	public static StringBuffer reverse(String str) {
		Stack<String> stack = new Stack<String>();
		String s = " ";
		String[] temp;
		StringBuffer o = new StringBuffer();
		
		temp = str.split(s);
		for(int i = 0; i < temp.length; i++) {
			stack.push(temp[i]);
		}
		
		for(int j = stack.size(); j > 0; j--) {
			o.append(s + stack.pop());
		}
		return o;
		
	}

}
