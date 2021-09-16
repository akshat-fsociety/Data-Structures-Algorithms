// https://practice.geeksforgeeks.org/problems/zero-sum-subarrays1825/1#

class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] a ,int n) 
    {
        //Your code here
        HashMap<Long, Integer> hm = new HashMap<>();
        long prefix=0, count=0;
        for(int i=0; i<n; i++){
            prefix += a[i];
            if(prefix==0)count++;
            if(hm.containsKey(prefix)){
                count+=hm.get(prefix);
            }
            hm.put(prefix , hm.getOrDefault(prefix,0)+1);
        }
        return count;
    }
}
