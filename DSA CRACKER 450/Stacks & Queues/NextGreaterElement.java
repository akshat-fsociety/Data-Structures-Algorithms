// https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/1
/*
    [1,3,2,4]
       <---- Traverse from back and check for the condition that is the current elem is greater or smaller if a[i]>s.peek() push it to stack
       else pop() till you get the next greater in the stack.
*/

class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] a, int n)
    { 
        // Your code here
        Stack<Long>s = new Stack<>();
        ArrayList<Long>ans = new ArrayList<>();
        long l[] = new long[n];
        // s.push(a[n-1]);
        // ans.add(-1l);
        for(int i=n-1; i>=0; i--){
            if(s.size()==0){
                ans.add(-1l);
            }else if(s.size()>0 && s.peek()>a[i]){
                ans.add(s.peek());
            }else if(s.size()>0 && s.peek()<=a[i]){
                while(s.size()>0 && s.peek()<=a[i]){
                    s.pop();
                }
                if(s.size()==0){
                ans.add(-1l);
                }else{
                    ans.add(s.peek());
                }
            }
            s.push(a[i]);
        }
        int ind=0;
        for(int i=ans.size()-1; i>=0; i--){
            l[ind++] = ans.get(i);
        }
        return l;
    } 
}
