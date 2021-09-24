// https://practice.geeksforgeeks.org/problems/reverse-a-linked-list/1

class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        // code here
        if(head==null || head.next==null)return head;
        Node prev = null;
        Node curr = head;
        Node forw = null;
        while(curr!=null){
            forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }
        return prev;
    }
}
