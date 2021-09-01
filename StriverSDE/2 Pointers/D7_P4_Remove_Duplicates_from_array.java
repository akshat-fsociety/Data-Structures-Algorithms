// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

class Solution {
    public int removeDuplicates(int[] a) {
        int n = a.length;
        int i=0, j=1;
        while(j<n){
            if(a[i] == a[j])j++;
            else{
                i++;
                a[i] = a[j];
                j++;
            }
        }
        return i+1;
    }
}
