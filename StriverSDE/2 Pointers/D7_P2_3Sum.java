// https://leetcode.com/problems/3sum/

class Solution {
    public List<List<Integer>> threeSum(int[] a) {
        List<List<Integer>> ans = new ArrayList<>();
        
        Arrays.sort(a);
        int n = a.length;
      
        for(int i=0; i<n-2; i++){
          
            if(i==0 || (i>0 && a[i]!=a[i-1])){
              
                int low = i+1, hi = a.length-1, sum = 0-a[i];
              
                while(low < hi){
                    if(a[low] + a[hi] == sum){
                        
                        ans.add(Arrays.asList(a[i], a[low], a[hi]));
                        
                        while(low<hi && a[low]==a[low+1])low++;
                        while(low<hi && a[hi]==a[hi-1])hi--;

                        low++; hi--;
                    }
                  
                    else if(a[low] + a[hi] < sum) low++;
                    else hi--;
                }
            }
        }
        return ans;
    }
}
