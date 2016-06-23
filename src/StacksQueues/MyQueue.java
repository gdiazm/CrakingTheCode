package StacksQueues;

import java.util.Stack;

public class MyQueue {
	private Stack<Comparable> oldStack;
	private Stack<Comparable> newStack;
	
	public MyQueue(){
		this.oldStack = new Stack<Comparable>();
		this.newStack = new Stack<Comparable>();
	}
	
	public void enqueue(Comparable c){
		newStack.push(c);
	}
	
	public Comparable dequeue(){
		shiftStacks();
		return oldStack.pop();
	}
	
	public Comparable peek(){
		shiftStacks();
		return oldStack.peek();
	}
	
	public void shiftStacks(){
		if(oldStack.size() == 0){
			while(!newStack.isEmpty()){
				oldStack.push(newStack.pop());
			}
		}
	}
}
