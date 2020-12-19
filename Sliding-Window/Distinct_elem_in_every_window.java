//https://practice.geeksforgeeks.org/problems/count-distinct-elements-in-every-window/1/?category[]=sliding-window&problemStatus=unsolved&page=1&query=category[]sliding-windowproblemStatusunsolvedpage1#

class Solution
{
    ArrayList<Integer> countDistinct(int a[], int n, int k)
    {
        ArrayList<Integer>ans = new ArrayList<>();
        HashMap<Integer, Integer>hm = new HashMap<>();
        for(int i=0; i<k; i++){
            hm.put(a[i], hm.getOrDefault(a[i],0)+1);
        }
        ans.add(hm.size());
        for(int i=k; i<n; i++){
            if(hm.get(a[i-k])==1)hm.remove(a[i-k]);
            
            else hm.put(a[i-k], hm.get(a[i-k])-1);
            
            hm.put(a[i], hm.getOrDefault(a[i],0)+1);
            
            ans.add(hm.size());
        }
        return ans;
    }
}
