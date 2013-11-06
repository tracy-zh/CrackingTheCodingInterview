package com.zhangtian.myself.trees_and_graphs;



public class BTNode {
	BTNode left;
	BTNode right;
	int value;
	boolean visited;
	
	public BTNode() {
		value = 0;
		left=null;
		right=null;
	}
	
	public BTNode(int value) {
		this.left = null;
		this.right = null;
		this.value = value;
	}

	public BTNode getLeft() {
		return left;
	}
	
	public BTNode getRight() {
		return right;
	}
	
	public int getValue() {
		return value;
	}
}
