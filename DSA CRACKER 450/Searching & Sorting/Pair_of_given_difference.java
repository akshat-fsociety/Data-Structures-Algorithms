// https://practice.geeksforgeeks.org/problems/find-pair-given-difference1559/1

class Solution
{
    public boolean findPair(int arr[], int l, int n)
    {
        //code here.
        Arrays.sort(arr);
        int i=0, j=1;
        while(i<l && j<l){
            if(i!=j && (arr[j]-arr[i] == n || arr[i]-arr[j] == n))return true;
            else if(arr[j]-arr[i] > n)
                i++;
            else j++;
        }
        return false;
    }
}
