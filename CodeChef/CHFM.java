//https://www.codechef.com/JULY19B/problems/CHFM
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
		    long a[] = new long[n];
		    double s=0,mean;
		    for(int i=0; i<n; i++){
		        a[i] = sc.nextInt();
		        s+=a[i];
		    }
		    mean = s/n;
		    int tmp=0,f=0;
		    double nsum=0.0, nmean=0.0;
		    int min = Integer.MAX_VALUE;
		    for(int i=0; i<n; i++){
		        int j=i+1;
		        nsum = s-a[i];
		        nmean = nsum/(n-1);
		        if(nmean==mean){
		            if(min>a[i]){
		                min = (int)a[i];
		                tmp=j;
		                f=1;
		            }
		        }
		    }
		    if(f==1)
		    System.out.println(tmp);
		    else
		    System.out.println("Impossible");
		}
	}
}
