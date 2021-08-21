// https://leetcode.com/problems/longest-substring-without-repeating-characters/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int len=0, left=0, right=0;
        HashMap<Character, Integer>hm = new HashMap<>();
        while(right < n){
            if(hm.containsKey(s.charAt(right))){
                left = Math.max(hm.get(s.charAt(right))+1, left);
            }
            hm.put(s.charAt(right), right);
            len = Math.max(len, right-left+1);
            right++;
        }
        return len;
    }
}
