// https://practice.geeksforgeeks.org/problems/maximum-product-subarray3604/1#

class Solution {
    long maxProduct(int[] a, int n) {
        // code here
        long current_max = a[0];
        long current_min = a[0];
        long ans = a[0];
        for(int i=1; i<n; i++){
            long prev_max = current_max;
            current_max = Math.max(a[i], Math.max(current_max*a[i], current_min*a[i]));
            current_min = Math.min(a[i], Math.min(prev_max*a[i], current_min*a[i]));
            ans = Math.max(ans, current_max);
        }
        return ans;
    }
}
