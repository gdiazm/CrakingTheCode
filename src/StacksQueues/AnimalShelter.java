package StacksQueues;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class AnimalShelter {
	private abstract class Animal{
		private int height;
		private int weight;
		private String name;
	}
	
	private class Dog extends Animal{}
	private class Cat extends Animal{}
	
	private LinkedList<Animal> queue;
	
	public AnimalShelter(){this.queue = new LinkedList<Animal>();}
	
	public void enqueue(Animal animal){
		queue.add(animal);
	}
	
	public Animal dequeueAny(){
		return queue.getFirst();
	}
	
	public Dog dequeueDog(){
		int index = queue.indexOf(new Dog());
		if(index < 0){throw new NoSuchElementException();}
		return (Dog) queue.get(index);
	}
	
	public Cat dequeueCat(){
		int index = queue.indexOf(new Cat());
		if(index < 0){throw new NoSuchElementException();}
		return (Cat) queue.get(index);
	}
}
