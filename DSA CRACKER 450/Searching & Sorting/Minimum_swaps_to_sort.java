// https://practice.geeksforgeeks.org/problems/minimum-swaps/1#

class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int a[])
    {
        // Code here
        int n = a.length;
        HashMap<Integer, Integer>hm = new HashMap<>();
        for(int i=0; i<n; i++){
            hm.put(a[i], i);
        }
        Arrays.sort(a);
        int ans = 0;
        boolean isVisited[] = new boolean[n];
        for(int i=0; i<n; i++){
            if(isVisited[i] || hm.get(a[i])==i)
                continue;
            
            int j = i, cycle=0;
            while(!isVisited[j]){
                isVisited[j] = true;
                
                j = hm.get(a[j]);
                cycle++;
            }
            if(cycle>0){
                ans+=cycle-1;
            }
        }
        return ans;
    }
}
