class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null)return true;
        
        ListNode slow = head;
        ListNode fast = head;
      
        // Find Middle
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
      
        // reverse the right half
        slow.next = reverse(slow.next);
        
        // move the slow pointer by 1
        slow = slow.next;
        
      //check both left and right half
        while(slow!=null){
            if(head.val!=slow.val)return false;
            head = head.next;
            slow = slow.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head){
         ListNode newHead = null;
        while(head!=null){
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }
}
