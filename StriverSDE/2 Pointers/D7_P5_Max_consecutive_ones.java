// https://leetcode.com/problems/max-consecutive-ones/

class Solution {
    public int findMaxConsecutiveOnes(int[] a) {
        int i=0, j=0;
        int n = a.length;
        int max = 0;
        while(j<n){
            if(a[i]==1 && a[j]==1){
                max = Math.max(max, j-i+1);
                j++;
            }else{
                j++;
                i=j;
            }
        }
        return max;
    }
}
