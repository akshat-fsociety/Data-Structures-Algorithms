// https://practice.geeksforgeeks.org/problems/evaluation-of-postfix-expression1735/1

class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String st)
    {
        // Your code here
        Stack<Integer>s = new Stack<>();
        for(int i=0; i<st.length(); i++){
            char c = st.charAt(i);
            if(Character.isDigit(c))
                s.push(c-'0');
            else{
                int b = s.pop();
                int a = s.pop();
                if(c=='*')s.push(a*b);
                else if(c=='/')s.push(a/b);
                else if(c=='+')s.push(a+b);
                else if(c=='-')s.push(a-b);
            }
        }
        return s.pop();
    }
}
