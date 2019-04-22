package leetode;
import java.util.*;

public class MergeTwoSortedLists {
	public static void main(String [] args) {
		
        ListNode n1 = new ListNode(5);
        n1.next = new ListNode(6); 
        n1.next.next = new ListNode(10);
        n1.next.next.next = null;
        
        ListNode n2 = new ListNode(1);
        n2.next = new ListNode(7); 
        n2.next.next = new ListNode(10);
        n2.next.next.next = new ListNode(13);
        n2.next.next.next.next = null;
        
        ListNode l3 = mergeTwoLists(n1 , n2);
        
        while(l3 != null) {
        	System.out.println(l3.val);
        	l3 = l3.next;
        }
        
	}
	
	 public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		 
		 
		 ListNode  head = new ListNode(0);
		 ListNode p = head;
		 while(l1 != null || l2 != null) {
			 if(l1 != null && l2 != null) {
				 if(l1.val > l2.val) {
					 p.next = l2;
					 l2 = l2.next;
				 }
				 else {
					 p.next = l1;
					 l1 = l1.next;
				 }
				 p = p.next;

			 }
			 else if(l1 == null) {
				 p.next = l2;
				 break;
			 }
			 else if(l2 == null) {
				 p.next = l1;
				 break;
			 }
		 }
		 return head.next;
	    }
}

class ListNode {
	 int val;
	 int size = 0;
	 ListNode next;
	 ListNode(int x) { 
		 val = x; 
		 size++;
	 	}
	 int size() {
		 return size;
	 }
	 
	 ListNode get(ListNode l) {
		 return l.next;
	 }
	 }
