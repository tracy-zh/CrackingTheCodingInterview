package com.zhangtian.myself.stacks_and_queue;

import java.util.Arrays;

public class TheQueue {

	private String[] queueArray;
	private int queueSize;
	private int front, rear, numberOfItems = 0;
	
	TheQueue(int size) {
		queueSize = size;
		queueArray = new String[size];
		
		Arrays.fill(queueArray, "-1");
	}
	
	
	public static void main(String[] args) {
		TheQueue theQueue = new TheQueue(10);
		
		theQueue.priorityInsert("10");
		theQueue.priorityInsert("50");
		theQueue.priorityInsert("11");
		theQueue.priorityInsert("76");
		
		theQueue.displayTheQueue();
		
		theQueue.remove();
		theQueue.displayTheQueue();
	}
	
	public void insert(String input) {
		if(numberOfItems + 1 <= queueSize) {
			queueArray[rear] = input;
			rear ++;
			numberOfItems++;
			System.out.println("Insert: " + input + " Was Added to the Queue\n");
		} else
			System.out.println("Sorry But the queue is full");
	}
	
	public void remove() {
		if(numberOfItems > 0) {
			System.out.println("REMOVE: " + queueArray[front] + " Was Removed");
			queueArray[front] = "-1";
			front ++;
			numberOfItems--;
		} else {
			System.out.println("Sorry But the queue is empty");
		}
	}
	
	public void peek(){
		System.out.println("The first element is " + queueArray[front]);
	}
	
	public void priorityInsert(String input) {
		int i;
		if(numberOfItems == 0){
			insert(input);
		} else {
			for(i = numberOfItems - 1; i >= 0; i --) {
				if(Integer.parseInt(input) > Integer.parseInt(queueArray[i])) {
					queueArray[i + 1] = queueArray[i];				
				} else break;
			} 
			queueArray[i + 1] = input;
			rear ++;
			numberOfItems ++;
		}
	}
	
	public void displayTheQueue() {
		if(queueSize != 0) {
			System.out.print("|");
			for(int i = 0; i < queueSize; i ++) {
				System.out.print(i + " |");
			}
			System.out.println();
			System.out.print("|");
			for(int i = 0; i < queueSize; i ++) {
				if(queueArray[i] != "-1") {
					System.out.print(queueArray[i] + "|");	
				} else
					System.out.print("  " + "|");
			}
		} else 
			System.out.println("This is a empty Stack!");
		System.out.println();
	}

}
