package GraphsAndTrees;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListOfDepths {
	
	private ArrayList<LinkedList<TreeNode>> lists = new ArrayList<LinkedList<TreeNode>>();
	private ArrayList<TreeNode> firstQueue = new ArrayList<TreeNode>();
	private ArrayList<TreeNode> secondQueue = new ArrayList<TreeNode>();
	
	public void createList(TreeNode root){
		if(root == null)return;
		secondQueue.add(root);
		while(!secondQueue.isEmpty()){
			if(firstQueue.isEmpty()){
				copyQueue();
				lists.add(new LinkedList<TreeNode>());
			}
			TreeNode current = firstQueue.get(0);
			lists.get(lists.size()-1).add(current);
			current.marked = true;
			if(current.left!=null&&!current.left.marked)secondQueue.add(current.left);
			if(current.right!=null&&!current.right.marked)secondQueue.add(current.right);
		}
	}
	
	private void copyQueue(){
		while(!secondQueue.isEmpty())firstQueue.add(secondQueue.remove(0));
	}
	
	public void showLists(){
		int i=0;
		for(LinkedList<TreeNode>list : this.lists){
			System.out.println("List " + i++);
			for(TreeNode node: list){
				System.out.print(node.id + " ");
			}
		}
	}
}
