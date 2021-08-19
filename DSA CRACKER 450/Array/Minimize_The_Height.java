// https://practice.geeksforgeeks.org/problems/minimize-the-heights3351/1


class Solution {
    int getMinDiff(int[] a, int n, int k) {
        Arrays.sort(a);
       int ans = a[n-1]-a[0];
       int smallest=0;
       int largest=0;
       for(int i=1; i<n; i++){
           if(a[i]>=k){
               largest = Math.max(a[i-1]+k, a[n-1]-k);
               smallest = Math.min(a[0]+k, a[i]-k);
               ans = Math.min(ans,largest-smallest );
           }
       }
       return ans;
       
    }
}
