// https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1

class Solution{
    int maxSubarraySum(int a[], int n){
        
        // Your code here
        int sum=0,max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            sum += a[i];
            if(sum > max) max = sum;
            if(sum<0)sum=0;
        }
        return max;
    }
    
}
