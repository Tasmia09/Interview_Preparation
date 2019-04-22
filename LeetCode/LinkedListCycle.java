package leetode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	
	public boolean hasCycle(ListNode head) {
		
		
		//My Solution
		Set <ListNode> ht = new HashSet<ListNode>(); 
        
        while(head!=null){
            if(!ht.contains(head)){
                ht.add(head);
            }else{
                return true;
            }
            head = head.next;
        }
        
        return false;
		
		
		//Leetcode Solution 
		
		/*
		 * Just have every visited node next pointer point to itself.
		End either next pointer is itself or next pointer is null
		 * */
        /*if(head == null){
            return false;
        }
        ListNode curr = head;
        ListNode ahead = curr.next;
        while(curr.next != null){
            if(curr.next == curr){
                return true;
            }
            curr.next = curr;
            curr = ahead;
            ahead = ahead.next;
        }
        return false;*/
    }

}
