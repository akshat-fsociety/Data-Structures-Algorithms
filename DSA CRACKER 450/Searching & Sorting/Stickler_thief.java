// https://practice.geeksforgeeks.org/problems/stickler-theif-1587115621/1#

class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int a[], int n)
    {
        // Your code here
        if(n==1)return a[0];
        int dp[] = new int[n];
        dp[0] = a[0];
        dp[1] = Math.max(a[0], a[1]);
        for(int i=2; i<n; i++){
            dp[i] = Math.max(dp[i-1], a[i]+dp[i-2]);
        }
        return dp[n-1];
    }
}
