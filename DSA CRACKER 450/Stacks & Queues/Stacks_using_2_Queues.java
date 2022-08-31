// https://practice.geeksforgeeks.org/problems/stack-using-two-queues/1

class Queues
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    //Function to push an element into stack using two queues.
    void push(int a)
    {
	    // Your code here	
	    q2.offer(a);
	    while(!q1.isEmpty()){
	        q2.offer(q1.peek());
	        q1.poll();
	    }
	    Queue<Integer>q = q1;
	    q1 = q2;
	    q2 = q;
    }
    
    //Function to pop an element from stack using two queues. 
    int pop()
    {
	    // Your code here
	    if(q1.isEmpty()){
	        return -1;
	    }
	    return q1.poll();
    }
	
}
