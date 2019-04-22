package leetode;

public class ReverseList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode current = head;
        ListNode pre = null, next = null;
        
        while(current != null){
            next = current.next;
            current.next = pre;
            pre = current;
            current = next;
              
        }
        return pre;
    }
}
