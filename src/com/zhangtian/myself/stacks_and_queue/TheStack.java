package com.zhangtian.myself.stacks_and_queue;

import java.util.Arrays;

public class TheStack {

	private String[] stackArray;
	
	private int stackSize;
	
	private int topOfStack = -1;
	
	TheStack(int size) {
		stackSize = size;
		stackArray = new String[size];
		Arrays.fill(stackArray, "-1");
		
	}
	public void push (String input) {
		if(topOfStack + 1 < stackSize) {
			topOfStack ++;
			stackArray[topOfStack] = input;
		} else
			System.out.println("Sorry But the Stack is full");
		displayTheStack();
		System.out.println("PUSH: " + input + " Was Added to the Stack");
		
	}
	
	public String pop() {
		if(topOfStack >= 0) {
			displayTheStack();
			System.out.println("POP: " + stackArray[topOfStack] + " Was Removed From the Stack\n");
			stackArray[topOfStack] = "-1";
			return stackArray[topOfStack--];

		} else {
			displayTheStack();
			System.out.println("Sorry But the Stack is Empty");
			return "-1";
		}
	}
	
	public String peek() {
		displayTheStack();
		System.out.println("PEEK: " + stackArray[topOfStack] + " Is at the Top of the Stack");
		return stackArray[topOfStack];

	}
	
	public void pushMany(String multipleValues) {
		String[] tempString = multipleValues.split(" ");
		for(int i = 0; i < tempString.length; i ++) {
			push(tempString[i]);
		}
	}
	
	public void popAll() {
		for(int i = topOfStack; i >= 0; i --) {
			pop();
		}
	}
	
	public static void main(String[] args) {
		TheStack theStack = new TheStack(10);
		theStack.push("10");
		theStack.push("15");
		theStack.peek();
		theStack.pop();
		
	
		theStack.pushMany("12 72 48 19 20");
		theStack.popAll();
		theStack.displayTheStack();
	}
	
	public void displayTheStack() {
		if(stackSize != 0) {
			System.out.print("|");
			for(int i = 0; i < stackSize; i ++) {
				System.out.print(i + " |");
			}
			System.out.println();
			System.out.print("|");
			for(int i = 0; i < stackSize; i ++) {
				if(stackArray[i] != "-1") {
					System.out.print(stackArray[i] + "|");	
				} else
					System.out.print("  " + "|");
			}
		} else 
			System.out.println("This is a empty Stack!");
		System.out.println();
	}
	

}
