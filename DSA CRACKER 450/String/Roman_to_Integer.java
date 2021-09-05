// https://practice.geeksforgeeks.org/problems/roman-number-to-integer3201/1

class Solution {
    public int romanToDecimal(String str) {
        int ans = 0;
        for(int i=0; i<str.length(); i++){
            int val1 = value(str.charAt(i));
            if(i+1<str.length()){
                int val2 = value(str.charAt(i+1));
                if(val1>=val2){
                    ans += val1;
                }else{
                    ans = ans+ val2-val1;
                    i++;
                }
            }
            else ans+=val1;
    }
    return ans;
    }
    public int value(char c){
        if(c=='I')return 1;
        else if(c=='V')return 5;
        else if(c=='X')return 10;
        else if(c=='L')return 50;
        else if(c=='C')return 100;
        else if(c=='D')return 500;
        else if(c=='M')return 1000;
        else return -1;
    }
}
