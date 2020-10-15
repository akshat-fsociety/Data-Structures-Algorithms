//https://www.codechef.com/problems/MODEFREQ

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
		    int a[] = new int[n];
		    for(int i=0; i<n; i++)a[i] = sc.nextInt();  //input array
		    int f[] = new int[11];                      //freq array
		    int fof[] = new int[n+1];                   //freq of freq array
		    Arrays.fill(f,0); Arrays.fill(fof,0);
		    for(int i=0; i<n; i++)
		    f[a[i]]++;                                 //freq of number
		    for(int i=1; i<=10; i++)
		    fof[f[i]]++;                               //freq of freq array
		    int ans=1; int max=fof[1];
		    for(int i=2; i<=n; i++){                  //mode of freq
		        if(fof[i]>max){
		            max = fof[i];
		            ans=i;
		        }
		    }
		    System.out.println(ans);
		    
		}
	}
}
