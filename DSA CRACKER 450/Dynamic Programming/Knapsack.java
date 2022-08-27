// https://practice.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1

static int knapSack(int w, int wt[], int v[], int n) 
    { 
         // your code here 
         int dp[][] = new int[n+1][w+1];
         for(int i=0; i<n+1; i++){
             for(int j=0; j<w+1; j++){
                 if(i==0 || j==0){
                     dp[i][j] = 0;
                 }
             }
         }
         for(int i=1; i<n+1;  i++){
             for(int j=1; j<w+1; j++){
                 if(wt[i-1]<=j){
                     dp[i][j] = Math.max(v[i-1]+dp[i-1][j-wt[i-1]], dp[i-1][j]);
                 }else{
                     dp[i][j] = dp[i-1][j];
                 }
             }
         }
         return dp[n][w];
    } 
}
