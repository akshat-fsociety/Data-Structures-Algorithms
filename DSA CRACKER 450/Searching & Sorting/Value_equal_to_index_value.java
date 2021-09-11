// https://practice.geeksforgeeks.org/problems/value-equal-to-index-value1330/1

class Solution {
    ArrayList<Integer> valueEqualToIndex(int a[], int n) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(a[i]==i+1)ans.add(a[i]);
        }
        return ans;
    }
}
