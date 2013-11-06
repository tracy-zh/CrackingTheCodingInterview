package com.zhangtian.myself.trees_and_graphs;

import java.util.LinkedList;
import java.util.Queue;
/*BFS uses Queue*/
import java.util.Stack;


public class BFS {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void BFS(BTNode root) {
		Queue<BTNode> queue = new LinkedList<BTNode>();
		queue.add(root);
		
		System.out.print(root.value + " ");
		while(!queue.isEmpty()) {
			
		}
	}
	public void bfs(BTNode root)
	{
		// BFS uses Queue data structure
		Queue<BTNode> queue = new LinkedList<BTNode>();
		queue.add(root);
		System.out.print(root.value + " ");
		System.out.println();
		root.visited = true;
		while(!queue.isEmpty()) {
			BTNode node = (BTNode)queue.remove();
			BTNode child=null;
			while((child=getUnvisitedChildNode(node))!=null) {
				child.visited=true;
				System.out.print(child.value + " ");
				queue.add(child);
			}
		}
		// Clear visited property of nodes
		clearNodes();
	}
 
	public void dfs(BTNode root) {
		// DFS uses Stack data structure
		Stack<BTNode> stack = new Stack<BTNode>();
		stack.push(root);
		root.visited=true;
		System.out.print(root.value + " ");
		System.out.println();
		while(!stack.isEmpty()) {
			BTNode node = (BTNode)stack.peek();
			BTNode child = getUnvisitedChildNode(node);
			if(child != null) {
				child.visited = true;
				System.out.print(child.value + " ");
				stack.push(child);
			}
			else {
				stack.pop();
			}
		}
		// Clear visited property of nodes
		clearNodes();
	}

}
