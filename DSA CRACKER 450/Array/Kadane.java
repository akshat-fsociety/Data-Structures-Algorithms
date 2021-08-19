// https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1

class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int a[], int n){
        int sum = 0, maxsum = a[0];
        for(int i=0; i<n; i++){
            sum += a[i];
            if(sum>maxsum)maxsum = sum;
            if(sum<0)sum=0;
        }
        return maxsum;
    }
}
