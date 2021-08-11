// https://leetcode.com/problems/sort-colors/submissions/

// Sort 0,1,2 without using any sorting function

class Solution {
    public void sortColors(int[] a) {
        
        // Dutch National Flag Algo
        int low=0, mid=0, hi=a.length-1,t;
        
        while(mid<=hi){
            
            if(a[mid]==0){
                t=a[mid];
                a[mid] = a[low];
                a[low] = t;
                low++; mid++;
            }else if(a[mid]==1){
                mid++;
            }else{
                t=a[hi];
                a[hi] = a[mid];
                a[mid] = t;
                hi--;
            }
        }
        for(int e:a){
            System.out.print(e);
        }
    }
}
