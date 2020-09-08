/*Given an integer K and a queue of integers, we need to reverse the order of the first K elements of the queue, leaving the other elements in the same relative order.

Only following standard operations are allowed on queue.

enqueue(x) : Add an item x to rear of queue
dequeue() : Remove an item from front of queue
size() : Returns number of elements in queue.
front() : Finds front item.
Example 1:

Input:
N = 5, K = 3
Queue = 1 2 3 4 5
Output: 3 2 1 4 5
Explanation: After reversing the given
input from the 3rd position the resultant
output will be 3 2 1 4 5.

Example 2:

Input:
N = 4, K = 4
Queue = 4 3 2 1
Output: 1 2 3 4
Explanation: After reversing the given
input from the 4th position the resultant
output will be 1 2 3 4.
Your Task:
Complete the provided function modifyQueue that takes queue and k as parameters and returns a modified queue. The printing is done automatically by the driver code.

Expected TIme Complexity : O(n)
Expected Auxilliary Space : O(n)

Constraints:
1 <= N <= 1000
1 <= K <= N

Note:The Input/Ouput format and Example given are used for system's internal purpose, and should be used by a user for Expected Output only. As it is a function problem, hence a user should not read any input from stdin/console. The task is to complete the function specified, and not to write the full code.*/


class GfG
{
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k)
    {
      Stack<Integer> st = new Stack<>();
      Queue<Integer> q1 = new LinkedList<>();
      int j=k-1;
      while(k--!=0){
          int t = q.peek();
          q.poll();
          st.push(t);
         }
         while(!st.isEmpty()){
             int t = st.peek();
             st.pop();
             q1.add(t);
         }
         while(!q.isEmpty()){
             int t = q.peek();
             q.poll();
             q1.add(t);
         }
      return q1;
    }
}
