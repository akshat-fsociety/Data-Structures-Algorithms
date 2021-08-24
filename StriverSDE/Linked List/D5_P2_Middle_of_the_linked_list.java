// https://leetcode.com/problems/middle-of-the-linked-list/

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode turtle = head, hare = head;
        while(hare!=null && hare.next!=null){
            turtle = turtle.next;
            hare = hare.next.next;
        }
        return turtle;
    }
}
