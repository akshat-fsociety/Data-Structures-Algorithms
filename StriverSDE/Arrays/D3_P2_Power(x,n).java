// https://leetcode.com/problems/powx-n/
// BINARY EXPONENTIATION

class Solution {
    public double myPow(double x, int n) {
        long t = n;
        double ans = 1.0;
        if(t<0) t = -1*t;
        while(t > 0){
            if((t&1)==1){
                ans = ans*x;
                t--;
            }else{
                x *= x;
                t/=2;
            }
        }
        if(n<0) ans = (double)1.0/(double)ans;
        return ans;
    }
}
