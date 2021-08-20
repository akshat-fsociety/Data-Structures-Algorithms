// https://practice.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1#

class GfG
{
    int maxLen(int a[], int n)
    {
        // Your code here
        HashMap<Integer, Integer>hm = new HashMap<Integer, Integer>();
        int sum=0, maxLen = 0;
        for(int i=0; i<n; i++){
            sum += a[i];
            if(sum==0){
                maxLen = i+1;
            }else{
                if(hm.get(sum) != null){
                    maxLen = Math.max(maxLen, (i-hm.get(sum)));
                }else{
                    hm.put(sum, i);
                }
            }
        }
        return maxLen;
    }
}
