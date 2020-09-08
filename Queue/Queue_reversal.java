/*Given a Queue Q containing N elements. The task is to reverse the Queue. Your task is to complete the function rev(), that reverses the N elements of the queue.

Example 1:

Input:
N = 6
Queue = 4 3 1 10 2 6
Output: 6 2 10 1 3 4
Explanation: After reversing the given
elements of the queue , the resultant
queue will be 6 2 10 1 3 4.
Example 2:

Input:
N = 4
Queue = 4 3 2 1 
Output: 1 2 3 4
Explanation: After reversing the given
elements of the queue , the resultant
queue will be 1 2 3 4.
Your Task:
 You only need to complete the function rev that takes a queue as parameter and returns the reversed queue. The printing is done automatically by the driver code.

Expected Time Complexity : O(n)
Expected Auxilliary Space : O(n)

Constraints:
1 ≤ N ≤ 105
1 ≤ elements of Queue ≤ 10^5*/

class GfG{
    public Queue<Integer> rev(Queue<Integer> q){
        Stack<Integer> st = new Stack<>();
        Queue<Integer> qrev = new LinkedList<>();
        while(!q.isEmpty()){
            int t = q.peek();
            q.poll();
            st.push(t);
        }
        while(!st.isEmpty()){
            int t = st.peek();
            st.pop();
            qrev.add(t);
        }
        return qrev;
    }
}
