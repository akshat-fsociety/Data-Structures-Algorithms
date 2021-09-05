class Solution
{
    long countPS(String s)
    {
        long dp[][] = new long[1001][1001];
        for(int i=0; i<1001; i++){
            for(int j=0; j<1001; j++)
                dp[i][j] = -1l;
        }
        return solve(dp, 0, s.length()-1, s)%1000000007;
    }
    public static long solve(long dp[][], int i, int j, String s){
        if(i>j)return 0l;
        else if(i == j)return 1l;
        else if(dp[i][j]!=-1l)return dp[i][j]%1000000007;
        else if(s.charAt(i)== s.charAt(j)) return dp[i][j] = (long)solve(dp, i+1, j, s) + (long)solve(dp, i, j-1, s)+1l;
        else return dp[i][j] = (long)solve(dp, i+1, j, s) + (long)solve(dp, i, j-1, s)-(long)solve(dp, i+1, j-1, s);
    }
}
