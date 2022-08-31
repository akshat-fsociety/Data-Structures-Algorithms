// https://practice.geeksforgeeks.org/problems/stack-permutations/1

class Solution {
    public static int isStackPermutation(int N, int[] A, int[] B) {
        // code here
       Stack<Integer> stack = new Stack<>();
       Queue<Integer> queue = new LinkedList<>();
       
       for(int i=0;i<N;i++){
           queue.add(B[i]);
       }
       
       for(int i=0;i<N;i++){
           stack.push(A[i]);
           
           while(!stack.isEmpty() && !queue.isEmpty() && stack.peek().equals(queue.peek())){
               stack.pop();
               queue.remove();
           }
       }
       if(queue.isEmpty()){
           return 1;
       }
       else
       return 0;
    }
}
            
