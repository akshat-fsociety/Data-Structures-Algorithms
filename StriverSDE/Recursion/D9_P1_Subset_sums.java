// https://practice.geeksforgeeks.org/problems/subset-sums2234/1#

class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n){
        // code here
        ArrayList<Integer>ans = new ArrayList<>();
        subset(0, 0, n, arr, ans);
        return ans;
    }
    public void subset(int l, int sum, int n, ArrayList<Integer>arr, ArrayList<Integer>ans){
        if(l==n){
            ans.add(sum);
            return;
        }
        // Pick up the element
        subset(l+1, arr.get(l)+sum, n, arr, ans);
        // Not picking up the element
        subset(l+1, sum, n, arr, ans);
    }
}
