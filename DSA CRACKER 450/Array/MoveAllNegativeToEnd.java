// https://practice.geeksforgeeks.org/problems/move-all-negative-elements-to-end1813/1#

class Solution {
    
    public void segregateElements(int a[], int n)
    {
        // Your code goes here
        int temp[] = new int[n];
        int ind=0;
        for(int i=0; i<n; i++){
            if(a[i]>=0){
                temp[ind++] = a[i];
            }
        }
        for(int i=0;i<n; i++){
            if(a[i]<0){
                temp[ind++] = a[i];
            }
        }
        for(int i=0;i<n; i++){
            a[i] = temp[i];
        }
    }
