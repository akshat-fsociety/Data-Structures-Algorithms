// https://leetcode.com/problems/4sum/

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        
        if(nums==null || nums.length==0){
            return res;
        }
        Arrays.sort(nums);
        
        int l = nums.length;
        for(int i=0; i<l; i++){
            for(int j=i+1; j<l; j++){
                int targetLeft = target - nums[i] - nums[j];
                int left = j+1;
                int right = l-1;
                while(left < right){
                    int two_sum = nums[left] + nums[right];
                    if(two_sum < targetLeft) left++;
                    else if(two_sum > targetLeft) right--;
                    else{
                        ArrayList<Integer> quad = new ArrayList<Integer>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[left]);
                        quad.add(nums[right]);
                        res.add(quad);
                        
                        // skipping the duplicates for left pointer
                        while(left < right && nums[left] == quad.get(2)) ++left;
                        
                        // skipping the duplicates for right pointer
                        while(left < right && nums[right] == quad.get(3)) --right;
                    }
                }
                
                    // skipping the duplicates for j
                    while(j+1 < l && nums[j+1] == nums[j]) ++j;
            }
            
                    // skipping the duplicates for i
                    while(i+1 < l && nums[i+1] == nums[i]) ++i;
        }
        return res;
    }
}
