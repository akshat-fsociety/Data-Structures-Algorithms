// https://practice.geeksforgeeks.org/problems/smallest-subarray-with-sum-greater-than-x5651/1#

class Solution {

    public static int sb(int a[], int n, int x) {
        // Your code goes here 
        int i=0, j=0, sum=0, ans = Integer.MAX_VALUE;
        while(j<n){
            while(sum<=x && j<n){
             sum += a[j++];   
            }
            while(sum>x && i<n){
                if(j-i < ans){
                    ans = j-i;
                }
                sum -= a[i++];
            }
        }
        return ans;
    }
}
