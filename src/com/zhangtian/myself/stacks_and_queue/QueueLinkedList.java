package com.zhangtian.myself.stacks_and_queue;

public class QueueLinkedList {

	Node head;

	
	QueueLinkedList() {
		head = null;
		
	}
	
	public static void main(String[] args) {
		QueueLinkedList s = new QueueLinkedList();
		s.add("15");
		s.add("25");
		s.add("63");
		s.add("83");
		s.display();
		System.out.println();
		s.poll();
		s.poll();
		s.display();
		
		System.out.println();
	//	s.clear();
		s.display();
		System.out.println(s.isEmpty());
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
	
	public String peek(){
		Node current = head;
		if(!isEmpty()) {
			while(current.next != null) {
				current = current.next;
			}
			return current.data;
		} else
			return null;
	}
	
	public void add(String str) {
		Node newNode = new Node(str);
		if(!isEmpty()) {
			newNode.next = head;
			head = newNode;
		
		} else
			head = newNode;
	}
	
	public void poll() {
		Node current = head;
		Node previous = head;
		if(!isEmpty()) {
			while(current.next != null) {
				previous = current;
				current = current.next;
			}
			previous.next = null;
		
		} else
			System.out.println("empty");
	}
	
	public void display() {
		Node current = head;
		if(!isEmpty()) {
			while(current!= null) {
				System.out.print(current.data + " ");
				current = current.next;
			}
			
		} else 
			System.out.println("Queue is Empty");

		
	}
	
}
