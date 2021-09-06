// https://leetcode.com/problems/longest-common-prefix/

class Solution {
    public String longestCommonPrefix(String[] str) {
        if(str.length==0)return "";
        String longest = str[0];
        for(int i=1;i<str.length;i++){
            while(str[i].indexOf(longest) != 0){            // Reducing length till common prefix
                longest = longest.substring(0, longest.length()-1);
            }
        }
        return longest;
    }
}
