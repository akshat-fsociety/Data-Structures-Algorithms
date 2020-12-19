//https://practice.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1/?category[]=sliding-window&page=1&query=category[]sliding-windowpage1

class Solution{
    static int maximumSumSubarray(int k, ArrayList<Integer> a,int n){
        int i=0,j=0,sum=0, max = Integer.MIN_VALUE;
        while(j<n){
            sum+=a.get(j);
            if(j-i+1 < k)j++;
            else if(j-i+1 == k){
                max = Math.max(sum, max);
                sum-=a.get(i);
                i++;
                j++;
            }
        }
        return max;
    }
