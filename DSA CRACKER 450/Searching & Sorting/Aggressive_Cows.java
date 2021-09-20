// https://www.spoj.com/problems/AGGRCOW/

import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
		    int n = sc.nextInt();
		    int cows = sc.nextInt();
		    int a[] = new int[n];
		    for(int i=0; i<n; i++)
		        a[i] = sc.nextInt();
		        
		    Arrays.sort(a);
		        
		    //Now Applying Binary Search for the search space of 1 to a[n-1]-a[0]
		    int low = 1, high = a[n-1]-a[0], ans=0;
		    while(low<=high){
		        int mid = low +(high-low)/2;
		        if(canPlaceCows(a,n,cows,mid)==true){
		            ans = mid;
		            low = mid+1;
		        }else{
		            high = mid-1;
		        }
		    }
		    System.out.println(ans);
		}
	}
	public static boolean canPlaceCows(int a[], int n, int cows, int dist){
	    int cow1 = a[0], count=1;
	    for(int i=1; i<n; i++){
	        if(a[i]-cow1>=dist){
	            cow1 = a[i];
	            count++;
	        }
	        if(cows==count)return true;
	    }
	    return false;
	}
}
