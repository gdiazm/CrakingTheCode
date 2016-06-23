package StacksQueues;

import java.util.Stack;

public class SortStack {
	private Stack<Comparable> mainStack;
	private Stack<Comparable> tempStack;
	
	public SortStack(){
		this.mainStack = new Stack<Comparable>();
		this.tempStack = new Stack<Comparable>();
	}
	
	public void push(Comparable c){
		while(!mainStack.isEmpty()&& c.compareTo(mainStack.peek())>0 ){
			tempStack.push(mainStack.pop());
		}
		mainStack.push(c);
		while(!tempStack.isEmpty()){
			mainStack.push(tempStack.pop());
		}
	}
	
	public Comparable pop(){
		return mainStack.pop();
	}
	
	public Comparable peek(){
		return mainStack.peek();
	}
	
	public boolean isEmpty(){
		return mainStack.isEmpty();
	}
}
