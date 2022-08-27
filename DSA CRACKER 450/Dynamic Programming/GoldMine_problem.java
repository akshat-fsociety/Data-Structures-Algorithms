// https://practice.geeksforgeeks.org/problems/gold-mine-problem2608/1

class Solution{
    static int maxGold(int n, int m, int M[][])
    {
        // code here
        int dp[][] = new int[n][m];
        int goldcollected = getmaxgold(M,dp,n, m);
        return goldcollected;
    }
    static int getmaxgold(int M[][], int dp[][], int n, int m){
        for(int c=m-1; c>=0; c--){
            for(int r=0; r<n; r++){
                int right = (c==m-1)?0:dp[r][c+1];
                int rightup = (r==0 || c==m-1)?0:dp[r-1][c+1];
                int rightdown = (r==n-1||c==m-1)?0:dp[r+1][c+1];
                dp[r][c] = M[r][c]+Math.max(Math.max(right, rightdown),rightup);
            }
        }
        int max = dp[0][0];
        for(int i=1; i<n; i++){
            max = Math.max(max, dp[i][0]);
        }
        return max;
    }
}
