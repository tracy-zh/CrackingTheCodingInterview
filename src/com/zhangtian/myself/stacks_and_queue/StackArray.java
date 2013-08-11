package com.zhangtian.myself.stacks_and_queue;
import java.util.Arrays;

public class StackArray {

	String[] stack;
	int top = -1;
	
	int stackSize = 0;
	
	StackArray(int size) {
		this.stackSize = size;
		stack = new String[size];
		
		Arrays.fill(stack, null);
	}
	
	public void clear() {
		Arrays.fill(stack, null);
		top = -1;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public int length() {
		return stackSize;
	}
	
	public String peek() {
		if(!isEmpty()) {
			return stack[top];		
		} else
			return null;
	}
	
	public void push(String str) {
		if(top < stackSize){
			stack[top + 1] = str;
			top ++;
		} else
			System.out.println("full");
	}
	
	public String pop() {
		if(top >= 0) {
			String temp = stack[top];
			stack[top] = null;
			top--;
			return temp;
		} else {
			System.out.println("empty");
			return null;
		}
			
	}
	
	public void display(){
		for(int i = 0; i < stackSize; i ++){
			System.out.print(stack[i] + " ");
		}
	}
	
	

	
	public static void main(String[] args) {
		StackArray s = new StackArray(10);
		s.push("15");
		s.push("25");
		s.push("63");
		s.push("83");
		s.display();
		System.out.println();
		System.out.println(s.pop());
		System.out.println(s.pop());
		s.display();
		System.out.println();
	//	s.clear();
		s.display();
		System.out.println(s.isEmpty());
	}

}
