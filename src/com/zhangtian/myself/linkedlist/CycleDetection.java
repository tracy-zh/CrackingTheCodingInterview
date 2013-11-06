package com.zhangtian.myself.linkedlist;

public class CycleDetection {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.appendToTail(900);
		l.appendToTail(400);
		l.appendToTail(714);
		l.appendToHead(900);
		l.appendToHead(400);
		l.appendToHead(714);
		l.getLast().next = l.get(2);
		
		//test for cycle detection
		System.out.println(hasLoop(l.head));
	}
	
	public static boolean hasLoop(Node head) {
		Node slow = head;
		Node fast = head;
		while(fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast)
				return true;
		}
		return false;
	}
}
