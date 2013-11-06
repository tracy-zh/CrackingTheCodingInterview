package com.zhangtian.myself.linkedlist;

public class SinglyLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l = new LinkedList();
		l.appendToTail(900);
		l.appendToTail(400);
		l.appendToTail(714);
		l.appendToHead(900);
		l.appendToHead(400);
		l.appendToHead(714);
		System.out.println(l.isEmpty());
		//l.remove(3);
		l.display();
		l.insertAfterKey(0, 0);
		l.display();
		l.insertAfterKey(5, 0);
		l.display();
		l.remove(4);
		l.display();
		System.out.println(l.indexOf(900));
		System.out.println(l.get(3));


		l.clear();

	}

}
class Node {
	Node next;
	int data;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
	
	public Node() {
		this.data = -1;
		this.next = null;
	}
}

class LinkedList {
	Node head;
	
	LinkedList() {
		head = new Node();
	}
	
	public void clear() {
		head.next = null;
	}
	
	public boolean isEmpty() {
		return head.next == null;
	}
	
	public int length() {
		Node currentNode = head.next; //currentNode is the first node
		int length = 0;
		while(currentNode != null) {
			currentNode = currentNode.next;
			length++;
		}
		return length;
	}
	
	public void display() {
		Node currentNode = head.next; //first node
		while(currentNode != null) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.next;
		}
		System.out.println();
	}
	
	public void appendToTail(int data) {
		Node newNode = new Node(data);
		Node currentNode = head;
		
		while(currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = newNode;
	}
	
	public void appendToHead(int data) {
		Node newNode = new Node(data);
		
		newNode.next = head.next;
		head.next = newNode;
	}
	
	public void insertAfterKey(int key, int data) {
		Node newNode = new Node(data);
		Node currentNode = head;
		
		if(key > length() - 1) {
			System.out.println("out of range");
		}
		else {
			for(int i = 0; i < key; i++) {
				currentNode = currentNode.next;
			}
			newNode.next = currentNode.next;
			currentNode.next = newNode;
		}
	}
	
	public void remove(int key) {
		Node previousNode = head;
		Node currentNode = head;
		
		if(key > length() - 1) {
			System.out.println("out of range");
		}
		else {
			for(int i = -1; i < key; i++) {
				previousNode = currentNode;
				currentNode = currentNode.next;
			}
			previousNode.next = currentNode.next;
		}
	}
	
	public int indexOf(int data) {
		Node currentNode = head;
		int i = -1;
		
		while(currentNode.data != data) {
			if(currentNode.next == null)
				return -1;
			else{
				currentNode = currentNode.next;
				i++;
			}	
		}
		return i;
		
	}
	
	public Node get(int key) {
		Node currentNode = head;
		
		if(key > length() - 1) {
			System.out.println("out of range");
		}
		else {
			for(int i = -1; i < key; i++) {
				currentNode = currentNode.next;
			}
		}
		return currentNode;
	}
	
	public Node getLast() {
		Node currentNode = head;
		
		while(currentNode.next != null) {
			currentNode = currentNode.next;
		}
		return currentNode;
	}
	
	
}







