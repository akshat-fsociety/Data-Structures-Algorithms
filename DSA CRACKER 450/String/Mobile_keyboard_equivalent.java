// https://practice.geeksforgeeks.org/problems/convert-a-sentence-into-its-equivalent-mobile-numeric-keypad-sequence0547/1

class Solution 
{ 
    String printSequence(String S) 
    { 
        // code here
        S = S.toUpperCase();
        String keys[] = {"2","22","222","3","33","333","4","44","444","5","55","555","6","66","666",
                      "7","77","777","7777","8","88","888","9","99","999","9999"};
        String ans = "";
        for(int i=0; i<S.length(); i++){
            char c = S.charAt(i);
            if(c==' ')
                ans+="0";
            else
                ans+=keys[c-65];
        }
        return ans;
    }
