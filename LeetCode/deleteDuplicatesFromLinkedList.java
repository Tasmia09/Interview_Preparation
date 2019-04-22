package leetode;

import java.util.ArrayList;


public class deleteDuplicatesFromLinkedList {
	public static void main (String [] args) {
		
	}
	
	public static ListNode deleteDuplicates(ListNode head) {
		ListNode curr = head;
		while(curr != null && curr.next != null) {
			if(curr.next.val == curr.val)
				curr.next = curr.next.next;
			else
				curr = curr.next;
		}
	    return head;
	    
	    
	    //if the list is not sorted
	    /*ArrayList<Integer> list=new ArrayList<Integer>();
		ListNode curr = head;
		ListNode prev = head;
	    while(curr!=null) {
	    	if(!(list.contains(curr.val))) {
	    		list.add(curr.val);
	    		prev = curr;
	    	}else {
	    		prev.next = curr.next;
	    	}
	    	curr = curr.next;
	    	
	    }
	    return head;*/
	}
}





