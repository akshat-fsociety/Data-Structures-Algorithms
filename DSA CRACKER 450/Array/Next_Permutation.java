// https://leetcode.com/problems/next-permutation/

class Solution {
    public void nextPermutation(int[] a) {
        if(a.length<=1 || a == null)return;
        
        int i = a.length - 2;
        while(i>=0 && a[i]>=a[i+1])i--; // index which breaks descending order 1342 (index =1)
        int j = a.length-1;
        if(i>=0){                       // if not entire descending
            while(a[j]<=a[i])j--;       // index of right most first large digit 1342 (index =2)
            swap(a, i, j);
        }
        reverse(a, i+1, a.length-1);   //reverse the rest 1432 -> 1423(ans)
    }
    
    public void swap(int []a, int i, int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    
    public void reverse(int []a, int i, int j){
        while(i<j)
            swap(a, i++, j--);
    }
}
