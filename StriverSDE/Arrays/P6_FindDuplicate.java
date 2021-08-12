//https://leetcode.com/problems/find-the-duplicate-number/

class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Boolean>hm = new HashMap<>();
        int res =0;
        for(int i=0; i<nums.length; i++){
            if(hm.containsKey(nums[i])){
                res=nums[i];
                break;
            }else{
                hm.put(nums[i],true);
            }
        }
        return res;
    }
}
