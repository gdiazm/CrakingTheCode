package StacksQueues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EmptyStackException;
import java.util.Stack;
import java.util.function.UnaryOperator;

public class StackOfPlatesArrayList {
	ArrayList<Stack<Integer>> stacks;
	ArrayList<Integer> freeSpots = new ArrayList<Integer>();
	int capacity;
	
	public StackOfPlatesArrayList(int capacity){
		this.capacity = capacity;
	}
	
	public Stack<Integer> getLastStack(){
		return stacks.get(stacks.size()-1);
	}
	
	public void push(int data){
		if(stacks == null){
			stacks = new ArrayList<Stack<Integer>>();
			Stack<Integer> newStack = new Stack<Integer>();
			newStack.push(data);
			stacks.add(newStack);
		}else{
			if(freeSpots.isEmpty()){
				Stack<Integer> currentStack = this.getLastStack();
				if(currentStack.size()<capacity){
					currentStack.push(data);
				}else{
					Stack<Integer> newStack = new Stack<Integer>();
					newStack.push(data);
					stacks.add(newStack);
				}
			}else{
				int position = freeSpots.get(freeSpots.size() - 1);
				Stack<Integer> currentStack = stacks.get(position);
				currentStack.push(data);
				freeSpots.remove(position);
			}
		}
	}
	
	public int pop(){
		if(stacks == null){throw new EmptyStackException();}
		Stack<Integer> lastStack = getLastStack();
		int value = lastStack.pop();
		if(lastStack.size() == 0){
			stacks.remove(stacks.size() - 1);
		}
		return value;
	}
	
	public int popAt(int index){
		if(index<0 || index>stacks.size() - 1){throw new IndexOutOfBoundsException();}
		Stack<Integer> currentStack = stacks.get(index);
		int value = currentStack.pop();	
		freeSpots.add(index);
		return value;
	}
	
}
