package com.zhangtian.myself.stacks_and_queue;

import java.util.Arrays;

public class QueueArray {

	String[] stack;
	int size;
	int front , rear,numberOfItems = 0;
	
	QueueArray(int size) {
		this.size = size;
		stack = new String[size];
		
		Arrays.fill(stack, null);
	}
	
	public static void main(String[] args) {
		QueueArray s = new QueueArray(10);
		s.add("15");
		s.add("25");
		s.add("63");
		s.add("83");
		s.display();
		System.out.println();
		s.remove();
		s.remove();
		s.display();
		
		System.out.println();
	//	s.clear();
		s.display();
		System.out.println(s.isEmpty());

	}
	
	public void clear() {
		Arrays.fill(stack, null);
		front = 0;
		rear = 0;
	}
	
	public boolean isEmpty() {
		return(front == 0 && rear == 0);
	}
	
	public int length() {
		return rear - front;
	}
	
	public String peek(){
		if(front == rear) {
			return null;
		} else {
			return stack[front];
		}
	}
	
	public void add(String str) {
		if(numberOfItems  < size) {
			stack[rear] = str;
			rear++;
			numberOfItems++;
		} else {
			System.out.println("full");
		}
	}

	public void remove() {
		if(rear > front) {
			stack[front] = null;
			front++;
			numberOfItems--;
		} else {
			System.out.println("empty");
		}
	}
	
	public void display() {
		if(!isEmpty()) {
			for(int i = front; i < rear; i++) {
				System.out.print(stack[i] + " ");
			}
		} else {
			System.out.print("Empty");
		}
	}
}
