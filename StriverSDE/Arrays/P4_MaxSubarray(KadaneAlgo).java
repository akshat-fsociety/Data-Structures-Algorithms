// https://leetcode.com/problems/maximum-subarray/submissions/

class Solution {
    public int maxSubArray(int[] a) {
        int max = a[0], sum=0;
        for(int i=0; i<a.length;i++){
            sum += a[i];
            if(sum>max)max = sum;
            if(sum<0)sum=0;
        }
        return max;
    }
}
