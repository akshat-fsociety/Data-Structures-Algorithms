// https://practice.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1

class Solution {
    int getPairsCount(int[] a, int n, int k) {
        // code here
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i=0; i<n; i++){
            if(!hm.containsKey(a[i])){
                hm.put(a[i], 1);
            }else{
                hm.put(a[i], hm.get(a[i])+1);
            }
        }
        int count = 0;
        for(int i=0; i<n; i++){
            int left = k-a[i];
            if(hm.get(left) != null){
                count += hm.get(left);
            }
            if(left == a[i])count--;
        }
        return count/2;
    }
}
