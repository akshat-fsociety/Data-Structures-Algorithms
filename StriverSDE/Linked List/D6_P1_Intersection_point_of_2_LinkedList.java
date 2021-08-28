// https://leetcode.com/problems/intersection-of-two-linked-lists/

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        if(headA==null || headB==null)return null;
        while(a!=b){
            a = a==null ? headB : a.next;
            b = b==null ? headA : b.next;
        }
        return a;
    }
}
