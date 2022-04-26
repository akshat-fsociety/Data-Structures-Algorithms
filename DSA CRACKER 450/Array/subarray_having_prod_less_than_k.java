// https://practice.geeksforgeeks.org/problems/count-the-subarrays-having-product-less-than-k1708/1/#

class Solution {
    
    public int countSubArrayProductLessThanK(long a[], long n, long k)
    {
        int ans=0;
        if(k<=1)return 0;
        long prod=1; int left=0,right=0;
        while(right<n){
            prod*=a[right];
            while(prod>=k){
                prod/=a[left++];
            }
            ans += right-left+1;
            right++;
        }
        return ans;
    }
}
