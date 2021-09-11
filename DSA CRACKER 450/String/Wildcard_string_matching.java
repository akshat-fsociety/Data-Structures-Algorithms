// https://practice.geeksforgeeks.org/problems/wildcard-string-matching1126/1#

class Solution{
    static boolean match(String wild, String pat)
    {
        // code here
        int n = pat.length();
        int m = wild.length();
        boolean dp[][] = new boolean[n+1][m+1];
        for(int i=0; i<n+1; i++){
            Arrays.fill(dp[i], false);
        }
        dp[0][0] = true;
        for(int j=1; j<m+1; j++){
            if(wild.charAt(j-1)=='*'){
                dp[0][j] = dp[0][j-1];
            }
        }
        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){
                if(wild.charAt(j-1)=='?' || pat.charAt(i-1)==wild.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }else if(wild.charAt(j-1)=='*'){
                    dp[i][j] = dp[i-1][j] || dp[i][j-1];
                }else{
                    dp[i][j] = false;
                }
            }
        }
        return dp[n][m];
    }
}
