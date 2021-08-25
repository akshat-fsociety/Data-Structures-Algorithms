// https://practice.geeksforgeeks.org/problems/median-in-a-row-wise-sorted-matrix1527/1

class Solution {
    int median(int a[][], int r, int c) {
        // code here     
        int start = 0, end = 2000, n=r*c;
        while(start<=end){
            int mid = (start+end)/2;
            int ans = 0;
            for(int i=0; i<r; i++){
                int l=0, h=c-1;
                while(l<=h){
                    int m = l+(h-l)/2;
                    if(a[i][m]<=mid){
                        l=m+1;
                    }else{
                        h=m-1;
                    }
                }
                ans+=l;
            }
            if(ans<=n/2)start = mid+1;
            else end = mid-1;
        }
        return start;
    }
