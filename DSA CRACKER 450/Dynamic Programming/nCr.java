// https://practice.geeksforgeeks.org/problems/ncr1019/1

class Solution{
    static long mod = 1000000007;
    static long dp[][];
    static int nCr(int n, int r)
    {
        // code here
        if(r>n)return 0;
        else{
             dp = new long[n+1][r+1];
            return (int)helper(dp,n,r);
        }
    }
    static long helper(long dp[][], int n, int r){
        if(r>n)return 0;
        if(r==0)return 1;
        if(n==r)return 1;
        if(dp[n][r]!=0)return dp[n][r];
        else{
            return dp[n][r] = (helper(dp, n-1, r-1)%mod+helper(dp, n-1,r)%mod)%mod;
        }
    }
}
