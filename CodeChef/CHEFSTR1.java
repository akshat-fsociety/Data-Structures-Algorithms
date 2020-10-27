//https://www.codechef.com/JULY20B/problems/CHEFSTR1

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t=0; 
		if(s.hasNextInt())
		t = s.nextInt();
        while (t--!=0) 
        { 
            int n = s.nextInt();
            long sum=0l;
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = s.nextInt();
            }
            
            for (int j = 0; j < n-1; j++) {
                int x = (a[j]-a[j+1]);
                if(x<0)sum+=Math.abs(x+1);
                else sum+=Math.abs(x-1);
            }
            System.out.println(sum);
        } 
	}
}
