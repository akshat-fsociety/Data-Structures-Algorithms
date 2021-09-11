// https://practice.geeksforgeeks.org/problems/consecutive-elements2306/1

class Solution{
    public String removeConsecutiveCharacter(String s){
        Stack<Character> st = new Stack<>();
        int n = s.length();
        String ans="";
        for(int i=0; i<n; i++){
            char c = s.charAt(i);
            if(st.isEmpty()){
               st.push(c); 
            }else{
               if(st.peek()==c){
                   st.pop();
                   st.push(c);
               }else{
                   st.push(c);
               } 
            }
        }
        while(!st.isEmpty()){
            ans = st.pop()+ans;
        }
        return ans;
    }
}
