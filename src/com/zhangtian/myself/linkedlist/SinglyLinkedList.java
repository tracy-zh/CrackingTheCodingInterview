package com.zhangtian.myself.linkedlist;

public class SinglyLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l = new LinkedList();
		l.createInLast(900);
		l.createInLast(400);
		l.createInLast(714);
		
		l.remove(3);
		l.display();
	}

}
class Node{
	int data;
	Node next;
	
	Node(int data) {
		this.data = data;
	}
	
	public int getData() {
		return data;
	}
	
	public Node getNext() {
		return next;
	}
	

}

class LinkedList {
	public Node head;
	
	LinkedList() {
		head = null;
	}
	
	public boolean isEmpty() {
		return(head == null);
	}
	
	public void clear() {
		head = null;
	}
	
	public int length() {	
		Node currentNode = head;
		int length = 1;
		if(isEmpty()) {
			return 0;
		} else {
			while(currentNode.next != null) {
				currentNode = currentNode.next;
				length ++;
			}
			return length;
		}
	}
	
	public Node createInHead(int data) {
		Node newNode = new Node(data);
		
		newNode.next = head;
		head = newNode;
		return head;
	}
	
	public Node createInLast(int data){
		Node newNode = new Node(data);
		Node currentNode = head;
		
		if(isEmpty()) {
			head = newNode;
		} else {
			while(currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;
			newNode.next = null;
		}
		return head;
	}
	
	public Node insertAfterKey(int n, int x) {
		Node currentNode = head;
		Node newNode = new Node(x);
		
		if(n >= length()){
			System.out.println("out of range");
		}
		else {
			for(int i = 0; i < n; i++) {
				currentNode = currentNode.next;
			}
			if(currentNode.next == null){
				currentNode.next = newNode;
			} else {
				newNode.next = currentNode.next;
				currentNode.next = newNode;			
			}
		}
		return head;
	}
	
	public void remove(int n) {
		Node currentNode = head;
		Node previousNode = head;
		
		if(n >= length()){
			System.out.println("out of range");
		} else {
			for(int i = 0; i < n; i++) {
				previousNode = currentNode;
				currentNode = currentNode.next;
			}
			if(currentNode.next == null) {
				previousNode.next = null;
			} else if(currentNode == head){
				head = currentNode.next;
			} else {
				previousNode.next = currentNode.next;
			}
		}
		//return currentNode.data;
	}
	
	public Node indexOf(int i) {
		Node currentNode = head;
		
		while(currentNode.data != i) {
			if(currentNode.next == null) {
				return null;
			} else {
				currentNode = currentNode.next;				
			}
		}
		return currentNode;
	}
	
	public Object get(int n) {
		Node currentNode = head;
		
		if(isEmpty()) {
			return null;
		} else if(n >= length()){
			return null;
		}
		else {
			for(int i = 0; i < n; i++) {
				currentNode = currentNode.next;
			}
			return currentNode.data;	
		}

	}
	
	public void display() {
		Node node = head;
		if(!isEmpty()) {
			while(node != null) {
				System.out.println("Data: " + node.data);
				System.out.println("Next Node: " + node.next);
				node = node.next;
			}
		} else {
			System.out.println("It's empty");
		}		
		System.out.println();
	}
	
}


















