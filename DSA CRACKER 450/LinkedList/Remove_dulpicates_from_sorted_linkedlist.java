// https://practice.geeksforgeeks.org/problems/remove-duplicate-element-from-sorted-linked-list/1

class GfG
{
    Node removeDuplicates(Node head)
    {
    	Node curr = head;
    	while(curr!=null && curr.next!=null){
    	    if(curr.data==curr.next.data){
    	        curr.next = curr.next.next;
    	    }else{
    	        curr = curr.next;
    	    }
    	}
    	return head;
    }
}
