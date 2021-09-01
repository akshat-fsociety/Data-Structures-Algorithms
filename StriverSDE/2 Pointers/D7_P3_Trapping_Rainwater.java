// https://leetcode.com/problems/trapping-rain-water/

class Solution {
    public int trap(int[] a) {
        
        int n = a.length;
        int left[] = new int[n];
        int right[] = new int[n];
        
        left[0] = a[0];
        for(int i=1; i<n; i++){
            left[i] = Math.max(a[i], left[i-1]);
        }
        
        right[n-1] = a[n-1];
        for(int i=n-2; i>=0; i--){
            right[i] = Math.max(a[i], right[i+1]);
        }
        
        int trap = 0;
        for(int i=0; i<n; i++){
            trap += Math.abs(a[i]-Math.min(left[i], right[i]));
        }
        return trap;
    }
}
