// https://practice.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1

class Compute {
    
    public void rotate(int a[], int n)
    {
        int l=0, r=n-1;
        while(l<=r){
            int t = a[l];
            a[l] = a[r];
            a[r] = t;
            l++;
        }
    }
