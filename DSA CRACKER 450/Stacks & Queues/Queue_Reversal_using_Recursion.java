// https://practice.geeksforgeeks.org/problems/queue-reversal/1

class GfG{
    //Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> q){
        //add code here.
        if(q.isEmpty()){
            return q;
        }else{
            int front = q.peek();
            q.poll();
            q = rev(q);
            q.offer(front);
            return q;
        }
    }
}
