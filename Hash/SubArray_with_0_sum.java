//https://practice.geeksforgeeks.org/problems/subarray-with-0-sum-1587115621/1/?category[]=sliding-window&problemStatus=unsolved&page=1&query=category[]sliding-windowproblemStatusunsolvedpage1

static boolean findsum(int a[],int n)
{
    //Your code here
    HashSet<Integer>hs = new HashSet<Integer>();
    int sum=0;
    for(int i=0; i<n; i++){
        sum+=a[i];
        
        if(a[i]==0 || sum==0 || hs.contains(sum))
        return true;
        hs.add(sum);
    }
    return false;
}
