// https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1

class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        int l=0,mid=0,h=n-1;
        while(mid<=h){
            if(a[mid]==0){
                int t = a[mid];
                a[mid] = a[l];
                a[l] = t;
                mid++; l++;
            }else if(a[mid]==1){
                mid++;
            }else{
                int t = a[mid];
                a[mid] = a[h];
                a[h] = t;
                h--;
            }
        }
    }
}
