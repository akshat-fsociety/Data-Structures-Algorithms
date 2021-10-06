// https://practice.geeksforgeeks.org/problems/check-if-linked-list-is-pallindrome/1

class Solution
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        //Your code here
        if(head==null)return true;
        Node mid = middle(head);
        Node last = reverse(mid);
        Node curr = head;
        while(last!=null){
            if(last.data!=curr.data)
                return false;
            last = last.next;
            curr = curr.next;
        }
        return true;
    }
    Node middle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
            return slow;
    }
    Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        while(curr!=null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
