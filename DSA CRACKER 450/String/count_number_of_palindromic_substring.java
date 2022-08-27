// https://practice.geeksforgeeks.org/problems/count-palindrome-sub-strings-of-a-string0652/1

class Solution
{
    int dp[][];
    public int CountPS(String s, int n)
    {
        //code here
        dp = new int[n][n];
        int ans = 0;
        for(int i=0; i <n; i++){
            for(int j=i+1; j<n; j++){
                if(count(dp,s,i, j)!=0)ans++;
            }
        }
        return ans;
    }
    public int count(int dp[][], String s, int i, int j){
        if(i>j)return 1;
        if(s.charAt(i)!=s.charAt(j))return dp[i][j]=0;
        if(dp[i][j]!=0)return dp[i][j];
        return dp[i][j] = count(dp, s, i+1, j-1);
    }
}
