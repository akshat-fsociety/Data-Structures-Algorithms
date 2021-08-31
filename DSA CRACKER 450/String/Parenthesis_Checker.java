// https://practice.geeksforgeeks.org/problems/parenthesis-checker2744/1

class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String s)
    {
        // add your code here
        int n= s.length();
        if(n%2!=0)return false;
        
        Stack<Character>st = new Stack<>();
        boolean isBalanced=true;
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
                continue;
            }
            if(st.isEmpty()){
                isBalanced = false;
                break;
            }
            if(ch==')'){
                if(st.peek()=='('){
                    st.pop();
                }else{
                    isBalanced = false;
                    break;
                }
            }
            if(ch=='}'){
                if(st.peek()=='{'){
                    st.pop();
                }else{
                    isBalanced = false;
                    break;
                }
            }
            if(ch==']'){
                if(st.peek()=='['){
                    st.pop();
                }else{
                    isBalanced = false;
                    break;
                }
            }
        }
        if(!st.isEmpty()) isBalanced = false;
        
        return isBalanced;
    }
}
