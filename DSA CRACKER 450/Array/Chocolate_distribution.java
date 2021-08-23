// https://practice.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1#

class Solution
{
    public long findMinDiff (ArrayList<Long> a, long n, long m)
    {
        // your code here
        Collections.sort(a);
        long ans = Long.MAX_VALUE;
        for(int i=0; i<=n-m; i++){
            ans = Math.min( ans, (a.get(i+(int)m-1) - a.get(i)) );
        }
        return ans;
    }
