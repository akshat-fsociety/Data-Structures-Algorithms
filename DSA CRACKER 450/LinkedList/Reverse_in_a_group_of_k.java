// https://practice.geeksforgeeks.org/problems/reverse-a-linked-list-in-groups-of-given-size/1

class Solution
{
    public static Node reverse(Node head, int k)
    {
        //Your code here
        Node nextt = null;
        Node prev = null;
        Node curr = head;
        int c=0;
        while(curr!=null && c<k){
            nextt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextt;
            c++;
        }
        if(nextt!=null){
            head.next = reverse(nextt, k);
        }
        return prev;
    }
}
