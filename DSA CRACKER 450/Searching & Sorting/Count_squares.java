// https://practice.geeksforgeeks.org/problems/count-squares3649/1

class Solution {
    static int countSquares(int a) {
        long x= a-1;
        long start=1, end=x, ans=0;
        if(x<=1)return (int)0;
        
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
