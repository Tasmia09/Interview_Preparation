package leetode;

public class RemoveElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode removeElements(ListNode head, int val) {
        ListNode curr = head;
        ListNode newLh= new ListNode(0);
        ListNode newL = newLh;
        int i = 0;
        while(curr != null){
            if(curr.val != val){
                if(i == 0){
                    newLh = curr;
                    newL = curr;
                }
                else {
                    newL.next = curr;
                    
                }
            }
            curr = curr.next;
            newL = newL.next;
            
            i++;
        }
        return newLh;
        
        
        //leetcode
        
        /*if(head == null)
            return null;
        ListNode current = head;
        ListNode tmp = head.next;

        while (tmp != null) {
            if (tmp.val != val)  {
              current = current.next;  
            }   
            else {   
              current.next = tmp.next; 
            }
            tmp = tmp.next;
        }
        if (head.val == val)
            return head.next;
        else
            return head;*/
    }
}
