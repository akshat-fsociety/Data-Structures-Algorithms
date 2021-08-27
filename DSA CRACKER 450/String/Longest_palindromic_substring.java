// https://practice.geeksforgeeks.org/problems/longest-palindrome-in-a-string3411/1#

class Solution{
    static String longestPalin(String s){
        // code here
        return longestsub(s);
    }
    public static String longestsub(String s){

        int maxlength = 1;
 
        int start = 0;
        int len = s.length();
 
        int low, high;
        for(int i=1; i<len; i++){
            // for even length of string
            low = i-1;
            high = i;
            while(low>=0 && high < len && s.charAt(low)==s.charAt(high)){
                --low;
                ++high;
            }
            ++low; --high;
            while(s.charAt(low)==s.charAt(high) && high-low+1>maxlength){
                start = low;
                maxlength = high-low+1;
            }
            
            // for odd length of string
            low = i-1;
            high = i+1;
            while(low>=0 && high < len && s.charAt(low)==s.charAt(high)){
                --low;
                ++high;
            }
            ++low; --high;
            while(s.charAt(low)==s.charAt(high) && high-low+1>maxlength){
                start = low;
                maxlength = high-low+1;
            }
        }
        return s.substring(start, start+maxlength);
    }
}
