// https://practice.geeksforgeeks.org/problems/remove-duplicates-from-an-unsorted-linked-list/1

class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
         // Your code here
         HashSet<Integer>hs = new HashSet<>();
         Node curr=head;
         Node prev=null;
         while(curr!=null){
             if(hs.contains(curr.data)){
                 prev.next = curr.next;
             }else{
                 hs.add(curr.data);
                 prev = curr;
             }
                 curr = curr.next;
         }
         return head;
    }
}
