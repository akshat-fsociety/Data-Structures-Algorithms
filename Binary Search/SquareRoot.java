//https://leetcode.com/problems/sqrtx/

class Solution {
    public int mySqrt(int a) {
        long x= a;
        long start=1, end=x, ans=0;
        if(x<=1)return (int)x;
        
        while(start<=end){
            long mid = (start+end)/2;
            
            if(mid*mid==x)return (int)mid;
            else if(mid*mid<x){
                start=mid+1;
                ans = mid;
            }else{
                end=mid-1;
            }
        }
        return (int)ans;
    }
}
