//https://www.codechef.com/problems/ICPC16B

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
		    int zero=0, one=0, minus_one=0, other=0;
		    for(int i=0; i<n; i++){
		        a[i] = sc.nextInt();
		        if(a[i]==0)zero++;
		        else if(a[i]==1)one++;
		        else if(a[i]==-1)minus_one++;
		        else other++;
		    }
		    if (other > 1)
            System.out.println("no");
            else
            {
            if (other>0 && minus_one>0)
            System.out.println("no");
            else if (minus_one > 1 && one == 0)
            System.out.println("no");
            else
            System.out.println("yes");
            }
		    
		
		}
	}
}
