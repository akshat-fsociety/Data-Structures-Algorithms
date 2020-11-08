//https://www.codechef.com/NOV20B/problems/ADADISH

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int findRecur(int a[], int i, int sum, int sumTot){
	    if(i==0){
	    int x = Math.abs((sumTot-sum)-sum);
	    return x;
	    }
	    return Math.min(findRecur(a, i-1, sum+a[i-1], sumTot), findRecur(a, i-1, sum, sumTot));
	}
	
	public static int min(int a[], int n){
	    int sumTot = 0;
	    for(int i=0; i<n; i++)sumTot += a[i];
	    
	    return findRecur(a, n, 0, sumTot);
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t=0; 
		if(sc.hasNextInt())
		t = sc.nextInt();
		while(t--!=0){
		    int n = sc.nextInt();
            int a[] = new int[n];
            double s=0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                s+=a[i];
            }
            Arrays.sort(a);
            if(n==1)System.out.println(a[0]);
            else if(n==2)System.out.println(a[1]);
            else{
                int d = min(a,n);
                double h = s/2;
                double diffh = d/2;
                h -= diffh;
                h += d;
                System.out.println((int)h);
            }
		}
	}
}

