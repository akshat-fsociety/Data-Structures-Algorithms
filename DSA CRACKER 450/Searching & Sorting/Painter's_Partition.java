// https://practice.geeksforgeeks.org/problems/the-painters-partition-problem1535/1

/* SOLUTION IS SAME AS ALLOCATE MINIMUM NUMBER OF PAGES */

class Solution{
    static long minTime(int[] a,int n,int k){
        long max = Long.MIN_VALUE, s=0;
        for(int i=0; i<n; i++){
            max = Math.max(a[i], max);
            s+=a[i];
        }
        long low = max, high = s, res=0;
        while(low<=high){
            long mid = low+(high-low)/2;
            if(canPaint(a,n,k,mid)){
                res = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return res;
    }
    public static boolean canPaint(int a[], int n, int k, long mid){
        long painter = 1;
        long board = 0;
        for(int i=0; i<n; i++){
            if(board+a[i]>mid){
                painter++;
                board = a[i];
            }else{
                board+=a[i];
            }
        }
        return (painter<=k);
    }
}
