// https://practice.geeksforgeeks.org/problems/intersection-of-two-sorted-linked-lists/1

class Sol
{
   public static Node findIntersection(Node head1, Node head2)
    {
        // code here.
        Node a = head1;
        Node b = head2;
        Node head = new Node(0);
        Node res = head;
        while(a!=null && b!=null){
            if(a.data!=b.data){
                if(a.data<b.data){
                    a = a.next;
                }else if(b.data<a.data){
                    b = b.next;
                }
            }else if(a.data == b.data){
                res.next = a;
                res = res.next;
                a = a.next;
                b = b.next;
            }
        }
        return head.next;
    }
}
