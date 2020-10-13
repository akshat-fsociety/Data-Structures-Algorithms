//https://www.codechef.com/problems/CHPINTU

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t=0; 
		if(sc.hasNextInt())
		t = sc.nextInt();
		while(t--!=0){
		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    int f[] = new int[n];
		    int p[] = new int[n];
		    int arr[] = new int[m];
		    int min = Integer.MAX_VALUE;
		    Arrays.fill(arr,-1);
		    int i;
		    for(i=0;i<n;i++){
		        f[i] = sc.nextInt();
		    }
		    for(i=0;i<n;i++){
		        p[i] = sc.nextInt();
		    }
		    for(i=0; i<n; i++){
		       if(arr[f[i]-1]==-1)
		       arr[f[i]-1]=0;
		       arr[f[i]-1]+=p[i];
		    }
		    for(int j=0; j<m; j++){
		        if(arr[j]!=-1){
		            if(arr[j]<min)
		            min = arr[j];
		        }
		    }
		    System.out.println(min);
		}
	}
}
