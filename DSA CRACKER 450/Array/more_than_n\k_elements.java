// https://practice.geeksforgeeks.org/problems/count-element-occurences/1

class Solution 
{
    //Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] a, int n, int k) 
    {
        // your code here,return the answer
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i=0; i<n; i++){
            if(hm.containsKey(a[i])){
                hm.put(a[i], hm.get(a[i])+1);
            }else{
                hm.put(a[i], 1);
            }
        }
        int c=0;
        for(int e: hm.values()){
            if(e>(n/k))c++;
        }
        return c;
    }
}
