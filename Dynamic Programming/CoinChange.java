// https://practice.geeksforgeeks.org/problems/coin-change2448/1#
// Unbounded Knapsack Variation

class Solution
{
    public long count(int a[], int n, int w) 
    { 
        long dp[][] = new long[n+1][w+1];
        for(int i=0; i<n+1; i++){
            for(int j=0; j<w+1; j++){
                if(i==0)
                    dp[i][j] = 0;
                if(j==0)
                    dp[i][j] = 1;
            }
        }
        for(int i=1; i<n+1; i++){
            for(int j=1; j<w+1; j++){
                if(a[i-1]<=j){
                    dp[i][j] = dp[i][j-a[i-1]] + dp[i-1][j];
                }else if(a[i-1]>j){
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return(dp[n][w]);
    } 
