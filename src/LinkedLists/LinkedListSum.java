package LinkedLists;

public class LinkedListSum {
	/*
	public Node sumLinkedList (Node l1, Node l2){
		Node res = null;
		Node head = null;
		Node p1 = shift(l1);
		Node p2 = shift(l2);
		boolean carry = false;
		while(p1!=null && p2!=null){
			int sum = p1.val + p2.val;
			if(carry){
				sum += 1;
				carry = false;
			}
			if(sum/10>=1){carry = true;}
			if(head == null){
				System.out.println("Entra 1");
				head = new Node(sum%10, null);
				res = head;
			}else{
				System.out.println("Entra");
				res.next = new Node(sum%10, null);
				res = res.next;
			}
			p1 = p1.next;
			p2 = p2.next;
		}
		while(p1!=null){
			int sum = p1.val;
			if(carry){
				sum += 1;
				carry = false;
			}
			if(sum/10>=1){
				carry = true;
			}
		
			res.next = new Node(sum%10, null);
			res = res.next;
			p1 = p1.next;
			
		}
		while(p2!=null){
			int sum = p2.val;
			if(carry){
				sum += 1;
				carry = false;
			}
			if(sum/10>=1){
				carry = true;
			}
				res.next = new Node(sum%10, null);
				res = res.next;
				p2 = p2.next;
			
		}
		if(carry){
			res.next = new Node(1, null);
			res = res.next;
		}
		
		return shift(head);
	}
	
	public Node shift (Node n){
		Node head = n;
		while(n!=null){
			Node next = n.next;
			n.next = head;
			head = n;
			n = next;
		}
		System.out.println("Sale del bucle");
		return head;
	}*/
	
}
