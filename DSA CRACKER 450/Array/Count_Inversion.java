// https://practice.geeksforgeeks.org/problems/inversion-of-array-1587115620/1

class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long inversionCount(long arr[], long n)
    {
        // Your Code Here
        long ans = 0l;
        long t[] = new long[(int)n];
        ans = merge_sort(arr, t, 0, arr.length-1);
        return ans;
    }
    public static long merge_sort(long a[], long t[], long low, long high){
        long mid=0l,count=0l;
        
        if(high>low){
            mid = (low+high)/2;
            
            count += merge_sort(a,t,low,mid);
            count += merge_sort(a,t,mid+1,high);
            
            count += merge(a,t,low,mid+1,high);
        }
        return count;
    }
    public static long merge(long a[], long t[], long low, long mid, long high){
        long count=0l;
        int i=(int)low;
        int j=(int)mid;
        int k=(int)low;
        while( (i<=mid-1) && (j<=high) ){
            if(a[i]<=a[j]){
                t[k++] = a[i++];
            }else{
                t[k++] = a[j++];
                count += mid-i;
            }
        }
        while(i<=mid-1){
            t[k++] = a[i++];
        }
        while(j<=high){
            t[k++] = a[j++];
        }
        for(int x=(int)low; x<=(int)high; x++){
            a[x] = t[x];
        }
        return count;
    }
}
