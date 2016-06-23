package ArraysAndStrings;

public class Partition{

	private class Node{
		private Node next;
		private int value;
		
		public Node(int value,Node next){
			this.value=value;
			this.next=next;
		}
	}
	
	public Node partition(int x,Node head){
		Node previous=null;
		Node p1=head;
		Node p2=head;
		Node finalHead=head;
		boolean first=true;
		
		while(p2.next!=null){
			p2=p2.next;
		}
		
		while(p1.next!=null)
		{
			if(p1.value>=x){
				if(previous!=null)
					previous=p1.next;
				Node newNode= new Node(p1.value,null);
				p2.next=newNode;
				p2=p2.next;
			}
			else{
				if(first){
					finalHead=p1;
					first = false;}
			}
			previous=p1;
			p1=p1.next;		
		}
		
		return finalHead;
	}
	
	public static void main(String[] args){
		Partition p = new Partition();
		Node n1=p.new Node(1,null);
		Node n2=p.new Node(2,n1);
		Node n3=p.new Node(10,n2);
		Node n4=p.new Node(5,n3);
		Node n5=p.new Node(8,n4);
		Node n6=p.new Node(5,n5);
		Node n7=p.new Node(3,n6);
		
		Node head;
		head=p.partition(5, n7);
		while(head!=null){
			System.out.println(head.value);
			head=head.next;
		}
	}
}
