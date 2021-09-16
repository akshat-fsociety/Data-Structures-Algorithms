// https://practice.geeksforgeeks.org/problems/product-array-puzzle4525/1

class Solution 
{ 
	public static long[] productExceptSelf(int a[], int n) 
	{ 
        // code here
        long p[] = new long[n];
        long prod=1;
        Arrays.fill(p,1);
        for(int i=0; i<n; i++){
            p[i] = prod;
            prod*=a[i];
        }
        prod=1;
        for(int i=n-1; i>=0; i--){
            p[i]*=prod;
            prod*=a[i];
        }
        return p;
	} 
} 
