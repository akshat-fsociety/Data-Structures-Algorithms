// https://leetcode.com/problems/reverse-pairs/
// inversion array concept with merge sort


class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length-1);
    }
    public static int mergeSort(int []a, int low, int high){
        if(low>=high) return 0;
        int mid = (low+high)/2;
        int inv = mergeSort(a,low,mid);
        inv += mergeSort(a, mid+1, high);
        inv += merge(a, low, mid, high);
        return inv;
    }
    public static int merge(int[]a, int low, int mid, int high){
        int cnt=0;
        int j = mid+1;
        for(int i=low; i<=mid; i++){
            while(j<=high && a[i]> (2*(long)a[j])){
                j++;
            }
            cnt += (j-(mid+1));
        }
        ArrayList<Integer>al = new ArrayList<>();
        int left = low, right = mid+1;
        while(left<=mid && right<=high){
            if(a[left]<=a[right]){
                al.add(a[left++]);
            }else{
                al.add(a[right++]);
            }
        }
        while(left<=mid){
            al.add(a[left++]);
        }
        while(right<=high){
            al.add(a[right++]);
        }
        for(int i=low; i<=high; i++){
            a[i] = al.get(i-low);
        }
        return cnt;
    }
}
