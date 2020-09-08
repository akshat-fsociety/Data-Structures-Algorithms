/*An string of words is given, the task is to reverse the string using stack.

Input Format:
The first line of input will contains an integer T denoting the no of test cases . Then T test cases follow. Each test case contains a string s of words without spaces.

Output Format:
For each test case ,print the reverse of the string in new line. 

Your Task:
Since this is a function problem, you don't need to take any input. Just complete the provided function.

Constraints:
1 <= T <= 100
1 <= length of the string <= 100

Example:
Input:
2
GeeksQuiz
GeeksforGeeks
Output:
ziuQskeeG
skeeGrofskeeG*/

class Solution {
    
    public void reverse(String str){
        String s = "";
       Stack<Character> st = new Stack<>();
       for(int i = 0; i<str.length(); i++){
           char p = str.charAt(i);
           st.push(p);
       }
       while(!st.isEmpty()){
           char ch = st.peek();
           st.pop();
           s += ch;
       }
       System.out.println(s);
    }

}
