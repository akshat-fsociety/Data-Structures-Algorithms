// https://practice.geeksforgeeks.org/problems/valid-substring0624/1

class Solution {
    static int findMaxLen(String S) {
        // code here
        int ans =0;
        Stack<Integer>s = new Stack<>();
        s.push(-1);
        for(int i=0; i<S.length(); i++){
            char c = S.charAt(i);
            if(c=='('){
                s.push(i);
            }else{
                s.pop();
                if(s.isEmpty()==true){
                    s.push(i);
                }else{
                    ans = Math.max(ans, i-s.peek());
                }
            }
        }
        return ans;
    }
}
