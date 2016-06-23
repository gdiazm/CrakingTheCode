package LinkedLists;

public class Main {
	public static void main(String[] args){
		/*LinkedListSum l = new LinkedListSum();
	    Node n1 = new Node(6,new Node(1,new Node (7,null)));
	  
	    Node n2 = new Node(2,null);
	    n2.next = new Node(9,null);
	    n2.next.next = new Node (5,null);
	    n2.next.next.next = new Node(5,null);
		
	    Node x = l.shift(n1);
		while(x!=null){
			System.out.print(x.val+" ");
			x = x.next;*/
		Node n1 = new Node('a',new Node('b',new Node('b',new Node ('a',null))));
		PalindromeChecker palindromeChecker = new PalindromeChecker ();
		System.out.println(palindromeChecker.check(n1)?"Palindrome":"Not a Palindrome");
	
	}
}
