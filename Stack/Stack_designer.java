/*You are given an array A of size N. You need to push the elements of the array into a stack and then print them while popping.

Example 1:

Input:
5
1 2 3 4 5

Output:
5 4 3 2 1
Example 2: 

Input: 
7
1 6 43 1 2 0 5

Output: 
5 0 2 1 43 6 1
 

Your Task:
Since this is a function problem, you don't need to take any input. Just complete the provided functions _push() and _pop().

Constraints:
1 <= Ai <= 10^7*/


public static Stack<Integer>_push(ArrayList<Integer> arr,int n)
{
    //Your code here
    Stack<Integer>st = new Stack<>();
   for(int i=0; i<n; i++){
       int x = arr.get(i);
       st.push(x);
   }
   return st;
    
}

public static void _pop(Stack<Integer>s)
{
    //Your code here
    while(!s.isEmpty()){
        System.out.print(s.pop()+" ");
    }
}
