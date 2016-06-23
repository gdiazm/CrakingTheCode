package GraphsAndTrees;

import java.util.LinkedList;

public class NodeRoute {

	private LinkedList<Node> queue = new LinkedList<Node>();
	
	public boolean checkRoute(Graph G, int n1, int n2){
		Node node1 = G.nodes[n1];
		Node node2 = G.nodes[n2];
		queue.add(node1);
		while(!queue.isEmpty()){
			Node current = queue.removeFirst();
			if(current.equals(node2)){return true;}
			current.marked = true;
			if(current.children!=null){
				for(int i=0; i<current.children.length; i++){
					if(!current.children[i].marked){
						queue.add(current.children[i]);
					}
				}
			}
		}
		return false;
	}
}
