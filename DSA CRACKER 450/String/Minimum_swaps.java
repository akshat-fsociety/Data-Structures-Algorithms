// https://practice.geeksforgeeks.org/problems/minimum-swaps-for-bracket-balancing2704/1

class Solution{
    static int minimumNumberOfSwaps(String s){
        int op=0, cl=0, swap=0, imbalance=0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='['){
                op++;
                if(imbalance>0){
                    swap+=imbalance;
                    imbalance--;
                }
            }else if(c==']'){
                cl++;
                imbalance = cl-op;
            }
        }
        return swap;
    }
}
