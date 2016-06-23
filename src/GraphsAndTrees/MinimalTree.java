package GraphsAndTrees;

import java.lang.reflect.Array;

public class MinimalTree {
	class Node{
		public int id;
		public Node left;
		public Node right;
	}
	
	public Node minimalTree(int[] array){
		return minimalTree(array, 0, array.length-1);
	}
	
	public Node minimalTree(int array[], int lo, int hi){
		if(lo>hi){return null;}
		int mid = lo + (hi-lo/2);
		Node current = new Node();
		current.id = mid;
		current.left = minimalTree(array, lo, mid-1);
		current.right = minimalTree(array, mid+1, hi);
		return current;
	}
	
	public void inOrderTraversal(Node root){
		if(root == null){return;}
		inOrderTraversal(root.left);
		System.out.println(root.id);
		inOrderTraversal(root.right);
		return;
	}
}
