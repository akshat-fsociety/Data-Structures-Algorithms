// https://practice.geeksforgeeks.org/problems/factorials-of-large-numbers2508/1#

class Solution {
    static ArrayList<Integer> factorial(int N){
        //code here
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);
        for(int i=2; i<=N; i++){
            int carry=0;
            for(int j=0; j<ans.size(); j++){
                int temp = ans.get(j)*i+carry;
                ans.set(j, temp%10);
                carry = temp/10;
            }
            while(carry!=0){
                ans.add(carry%10);
                carry/=10;
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}
