package GraphsAndTrees;

public class Main {
	public static void main(String[] args){
		/*NodeRoute nodeRoute = new NodeRoute();
		Graph g = new Graph();
		Node n5 = new Node("5",null);
		Node[] c6 = new Node[1];
		c6[0] = n5;
		Node n6 = new Node("6",c6);
		Node[] c4 = new Node[1];
		c4[0] = n6;
		Node n4 = new Node("4",c4);
		Node[] c3 = new Node[2];
		c3[0] = n5;
		c3[1] = n4;
		Node n3 = new Node("3",c3);
		Node[] c2 = new Node[1];
		c2[0] = n3;
		Node n2 = new Node("2",c2);
		Node[] c1 = new Node[2];
		c1[0] = n2;
		c1[1] = n3;
		Node n1 = new Node("1",c1);
		g.nodes = new Node[6];
		g.nodes[0] = n1;
		g.nodes[1] = n2;
		g.nodes[2] = n3;
		g.nodes[3] = n4;
		g.nodes[4] = n5;
		g.nodes[5] = n6;
		
		System.out.println(nodeRoute.checkRoute(g, 0, 4)?"Route":"No route");
		
		MinimalTree minimalTree = new MinimalTree();
		int[] array = {0,1,2,3,4,5,6,7};
		MinimalTree.Node root = minimalTree.minimalTree(array);
		minimalTree.inOrderTraversal(root);*/
		
		ListOfDepths lod = new ListOfDepths();
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);
		TreeNode node7 = new TreeNode(7);
		TreeNode node8 = new TreeNode(8);
		TreeNode node9 = new TreeNode(9);
		TreeNode node10 = new TreeNode(10);
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		node3.right = node7;
		node4.left = node8;
		node6.left = node9;
		node8.left=node10;
		
		lod.createList(node10);
		lod.showLists();
	}
}
