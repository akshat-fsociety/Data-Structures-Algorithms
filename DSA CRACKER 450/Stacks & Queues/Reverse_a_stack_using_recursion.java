// https://practice.geeksforgeeks.org/problems/reverse-a-stack/1

class Solution
{ 
    static void insert_bottom(Stack<Integer>s, int n){
        if(s.isEmpty()){
            s.push(n);
            return;
        }
        int top = s.pop();
        insert_bottom(s,n);
        
        s.push(top);
    }
    static void reverse(Stack<Integer> s)
    {
        // add your code here
       if(s.isEmpty())
            return; 
       int top = s.pop();
       reverse(s);
       insert_bottom(s,top);
    }
}
