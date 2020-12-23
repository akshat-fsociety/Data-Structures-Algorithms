//https://practice.geeksforgeeks.org/problems/rotation4723/1

class Solution {
    int findKRotation(int a[], int n) {
    
        int start =0, end =n-1;
        while(start<=end){
            int mid = start + ((end-start)/2);
            
            int next = (mid+1)%n;
            int prev = (mid+n-1)%n;
            
            if(a[mid]<=a[next] && a[mid]<=a[prev])
                return mid;
                
            else if(a[mid]<=a[end])
                end = mid-1;
                
            else if(a[start]<=a[mid])
                start = mid+1;
        }
        return  0;
    }
