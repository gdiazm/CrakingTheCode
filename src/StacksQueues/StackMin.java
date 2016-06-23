package StacksQueues;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackMin {
	class StackNode{
		private int data;
		private StackNode next;
		StackNode(int data){
			this.data = data;
		}
		int getData(){
			return this.data;
		}
	}
	
	private StackNode top;
	private Stack<Integer> minS = new Stack<Integer>();
	
	public void push(int data){
		StackNode stackNode = new StackNode(data);
		if(top == null){
			top = stackNode;
			minS.push(stackNode.data);
		}else{
			stackNode.next = top;
			top = stackNode;
			if(minS.peek() >= stackNode.data){
				minS.push(stackNode.data);
			}
		}
	}
	
	public StackNode pop(){
		if(top == null){
			throw new EmptyStackException();
		}
		StackNode oldTop = top;
		top = oldTop.next;
		if(minS.peek() == oldTop.data){minS.pop();}
		return oldTop;
	}
	
	public int min(){
		return minS.peek();
	}
}
