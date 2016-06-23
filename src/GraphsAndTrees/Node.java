package GraphsAndTrees;

public class Node{
	public String name;
	public boolean marked = false;
	public Node[] children;
	
	public Node(String name, Node[] children){
		this.name = name;
		this.children = children;
	}
}
