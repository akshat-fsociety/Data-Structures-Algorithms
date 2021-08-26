// https://practice.geeksforgeeks.org/problems/palindrome-string0817/1

class Solution {
    int isPlaindrome(String s) {
        // code here
        String t="";
        for(int i=s.length()-1; i>=0; i--){
            t += s.charAt(i);
        }
        if(t.equals(s))return 1;
        else return 0;
    }
