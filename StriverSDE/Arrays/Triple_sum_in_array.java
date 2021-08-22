// https://practice.geeksforgeeks.org/problems/triplet-sum-in-array-1587115621/1#

class Solution
{
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    public static boolean find3Numbers(int a[], int n, int x) { 
    
       // Your code Here
       Arrays.sort(a);
       int sum=0;
       for(int i=0; i<n-2; i++){
           int l = i+1;
           int r = n-1;
           while(l<r){
               if(a[i]+a[l]+a[r]==x){
                   return true;
               }else if(a[i]+a[l]+a[r]<x){
                   l++;
               }else{
                   r--;
               }
           }
       }
       return false;
    }
}
