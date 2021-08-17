// https://leetcode.com/problems/longest-consecutive-sequence/

class Solution {
    public int longestConsecutive(int[] a) {
       HashSet<Integer> hs = new HashSet<Integer>();
       for(int i:a){
           hs.add(i);
       }
        int longestStreak = 0;
        for(int num:a){
            if(!hs.contains(num-1)){
                int currentNum = num;
                int currentStreak = 1;
                while(hs.contains(currentNum+1)){
                    currentNum++;
                    currentStreak++;
                }
                longestStreak = Math.max(currentStreak, longestStreak);
            }
        }
        return longestStreak;
    }
}
