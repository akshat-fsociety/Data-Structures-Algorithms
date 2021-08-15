// https://leetcode.com/problems/two-sum/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int l = nums.length;
        int a[] = new int[2];
        for(int i=0; i<l; i++){
            map.put(nums[i], i);
        }
        for(int i=0; i<l; i++){
            int leftover = target-nums[i];
            if(map.containsKey(leftover) && map.get(leftover)!=i){
                a[0] = i;
                a[1] = map.get(leftover);
                return a;
            }else{
                map.put(nums[i], i);
            }
        }
        return a;
    }
}
