package com.zhangtian.myself.stacks_and_queue;

public class StackLinkedList {

	public Node head;
	
	StackLinkedList() {
		head = null;
	}
	
	public void clear() {
		head = null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public int length() {
		Node current = head;
		int length = 1;
		if(!isEmpty()) {
			while(current.next != null) {
				current = current.next;
				length++;
			}
			return length;
		} else {
			return 0;
		}
	}
	
	public String peek() {
		return head.data;
	}
	
	public void push(String str) {
		Node newNode = new Node(str);
		if(!isEmpty()) {
			newNode.next = head;
			head = newNode;
		} else {
			head = newNode;
		}
	}
	
	public String pop() {
		if(!isEmpty()) {
			Node temp;
			temp = head;
			head = head.next;
			return temp.data;			
		} else 
			return null;

	}
	
	public void display() {
		Node current = head;
		if(!isEmpty()) {
			while(current!= null) {
				System.out.print(current.data + " ");
				current = current.next;
			}
			
		} else 
			System.out.println("Stack is Empty");

		
	}
	
	public static void main(String[] args) {
		StackLinkedList s = new StackLinkedList();
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
		System.out.println(s.length());

		//	s.clear();
		s.display();
		System.out.println(s.isEmpty());
	}
	
	

}

class Node{
	String data;
	Node next;
	
	Node(String data) {
		this.data = data;
		this.next = null;
	}
}
