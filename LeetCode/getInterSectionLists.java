package leetode;

public class getInterSectionLists {

	
	/*
	 *  found most solutions here preprocess linkedlists to get the difference in
	 *   len.
Actually we don't care about the "value" of difference, we just want to make sure
 two pointers reach the intersection node at the same time.

We can use two iterations to do that. In the first iteration, we will reset 
the pointer of one linkedlist to the head of another linkedlist after it reaches
 the tail node. In the second iteration, we will move two pointers until they
  points to the same node. Our operations in first iteration will help us 
  counteract the difference. So if two linkedlist intersects, the meeting point
  
   in second iteration must be the intersection point. If the two linked lists 
   have no intersection at all, then the meeting pointer in second iteration must
    be the tail node of both lists, which is null

	 * */
	
public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode curA = headA;
        ListNode curB = headB;
        while (curA != null || curB != null) {
            if (curA == curB) return curA;
            curA = curA == null ? headB : curA.next;
            curB = curB == null ? headA : curB.next;
        }
        return null;
        
    }
}
