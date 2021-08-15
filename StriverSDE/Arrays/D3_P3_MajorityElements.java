// https://leetcode.com/problems/majority-element/
// MAJORITY ELEMENTS (>N/2) TIMES

class Solution {
    public int majorityElement(int[] nums) {
        int count =0;
        int elem = 0;
        for(int e:nums){
            if(count == 0){
                elem = e;
            }
            if(elem == e){
                count = count + 1;
            }else{
                count--;
            }
        }
        return elem;
    }
}
