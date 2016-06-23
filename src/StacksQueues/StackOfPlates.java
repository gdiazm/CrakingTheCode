package StacksQueues;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackOfPlates {
	private Stack<Stack<Integer>> bigStack;
	private int capacity;
	
	public StackOfPlates (int capacity){
		this.capacity = capacity;
	}
	
	public void push(int data){
		if(bigStack == null){
			bigStack = new Stack<Stack<Integer>>();
			Stack<Integer> smallStack = new Stack<Integer>();
			smallStack.push(data);
			bigStack.push(smallStack);
		}else{
			Stack<Integer> smallStack = bigStack.peek();
			if(smallStack.size()<capacity){
				smallStack.push(data);
			}else{
				Stack<Integer> newStack = new Stack<Integer>();
				newStack.push(data);
				bigStack.push(newStack);
			}
		}
	}
	
	public int pop(){
		if(bigStack == null){throw new EmptyStackException();}
		Stack<Integer> currentStack = bigStack.peek();
		int value = currentStack.pop();
		if(currentStack.size() == 0){
			bigStack.pop();
		}
		return value;
		
	}
}
