//https://practice.geeksforgeeks.org/problems/friends-pairing-problem5425/1

class Solution
{
    public long countFriendsPairings(int n) 
    { 
       //code here
       long dp[] = new long[n+2];
       for(int i=0;i<=n;i++){
           if(i<=2) dp[i] = i;
           else
           dp[i] = (dp[i-1]+(i-1)*dp[i-2])%1000000007;
       }
       return dp[n];
    }
}  
