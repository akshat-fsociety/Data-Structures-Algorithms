// https://practice.geeksforgeeks.org/problems/count-triplets-with-sum-smaller-than-x5549/1

class Solution
{
    long countTriplets(long a[], int n,int sum)
    {
        Arrays.sort(a);
        int c=0;
        for(int i=0; i<n-2; i++){
            int l=i+1, j=l+1;
            while(l<j){
                if(a[i]+a[l]+a[j] >= sum)j--;
                else{
                    c += j-l;
                    l++;
                }
            }
        }
        return c;
    }
}
