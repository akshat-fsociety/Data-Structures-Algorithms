//https://leetcode.com/problems/search-insert-position/

class Solution {
    public int searchInsert(int[] a, int x) {
        int start =0, end=a.length-1;
        while(start<=end){
            int mid = start+((end-start)/2);
            
            if(a[mid]==x)return mid;
            else if(a[mid]<x)start = mid+1;
            else end = mid-1;
        }
        return end+1;
    }
}
