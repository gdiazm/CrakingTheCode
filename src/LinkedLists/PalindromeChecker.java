package LinkedLists;

public class PalindromeChecker {
	public boolean check(Node n){
		Node slow = n;
		Node secondList = n;
		Node fast = n;
		while(fast.next != null && fast!=null){
			System.out.println("Entra");
			fast = fast.next.next;
			Node next = slow.next;
			slow.next = secondList;
			secondList = slow;
			slow = next;
		}
		if(secondList.val != slow.val){
			secondList = secondList.next;
		}
		while(secondList != null){
			if(secondList.val != slow.val){return false;}
			secondList = secondList.next;
			slow = slow.next;
		}
		return true;
	}
}
