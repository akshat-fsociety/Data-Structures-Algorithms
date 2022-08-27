// https://practice.geeksforgeeks.org/problems/subset-sum-problem2014/1?page=1&category[]=Dynamic%20Programming&sortBy=submissions

class Solution{
    static int equalPartition(int n, int a[])
    {
        // code here
        int s=0;
        for(int e:a)s+=e;
        if(s%2!=0)return 0;
        else{
            int w=s/2;
            boolean dp[][] = new boolean[n+1][w+1];
            for(int i=0; i<n+1; i++){
                for(int j=0; j<w+1; j++){
                    if(i==0)dp[i][j] = false;
                    if(j==0)dp[i][j] = true;
                }
            }
            for(int i=1; i<n+1; i++){
                for(int j=1; j<w+1; j++){
                    if(a[i-1]<=j){
                        dp[i][j] = dp[i-1][j-a[i-1]]||dp[i-1][j];
                    }else{
                        dp[i][j] = dp[i-1][j];
                    }
                }
            }
            return (dp[n][w]==true?1:0);
        }
    }
}
