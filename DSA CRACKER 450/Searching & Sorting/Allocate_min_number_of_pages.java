// https://practice.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937/1#

class Solution 
{
    //Function to find minimum number of pages.
    public static int findPages(int[]a,int n,int m)
    {
        if(n<m)return -1; // If number of students are greater than no. of book
        
        int sum=0, max=0;
         for(int i=0;i<n;i++){
             sum+=a[i];
             max=Math.max(max,a[i]);
         }
        int low = max;
        int high = sum;
        int res = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(isValid(a,n,mid, m)){
                res = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return res;
    }
    
    public static boolean isValid(int a[],int n, int mid, int m){
        int student = 1;
        int pages=0;
        for(int i=0; i<n; i++){
            if((pages+a[i]) > mid){
                student++;
                pages = a[i];
            }
            else{
                pages+=a[i];
            }
        }
        return (student<=m);
    }
}
