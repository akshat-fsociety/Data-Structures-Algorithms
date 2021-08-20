// https://practice.geeksforgeeks.org/problems/subarray-with-0-sum-1587115621/1

class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int a[],int n)
    {
        //Your code here
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int s=0;
        for(int i=0; i<n; i++){
            s += a[i];
            if(s==0)return true;
            if(!hm.containsKey(s)){
                hm.put(s,1);
            }else{
                return true;
            }
        }
        return false;
    }
