// https://practice.geeksforgeeks.org/problems/intersection-point-in-y-shapped-linked-lists/1

class Intersect
{
    //Function to find intersection point in Y shaped Linked Lists.
	int intersectPoint(Node head1, Node head2)
	{
         // code here
         Node a = head1;
         Node b = head2;
         if(a==null || b==null)return -1;
         while(a!=b){
             a = a==null? head2: a.next;
             b = b==null? head1: b.next;
         }
         return a.data;
	}
}
