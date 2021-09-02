// https://practice.geeksforgeeks.org/problems/count-the-reversals0401/1

class Sol
{
    int countRev (String s)
    {
        // your code here
        Stack<Character>st = new Stack<>();
        int l = s.length();
        
        if(l%2!=0)
          return -1;  // if length is odd
        
        // looping to get rid of the balanced brackets pair 
        for(int i=0; i<l; i++){
            char c = s.charAt(i);
            if(!st.isEmpty() && c=='}'){
                if(st.peek()=='{')
                    st.pop();
                else
                    st.push(c);
            }
            else{
                st.push(c);
            }
        }
        
        int open = 0;
        int size = st.size();
        
        // counting the open brackets in unbalanced string
        while(!st.isEmpty() && st.peek()=='{'){
            open++;
            st.pop();
        }
        return (size/2+open%2);
    }
}
