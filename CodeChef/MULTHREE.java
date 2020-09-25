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
		int t = 0;
		if(sc.hasNextInt())
		t = sc.nextInt();
		while(t--!=0){
		    long k = sc.nextLong();
		    long d0 = sc.nextLong();
		    long d1 = sc.nextLong();
		    long dsum = d0+d1;
		    long sum =0;
		    sum += dsum;
            sum += dsum % 10;
            sum += ((  k  ) / 4) * ((2 * dsum) % 10);
            sum += ((k - 1) / 4) * ((4 * dsum) % 10);
            sum += ((k - 2) / 4) * ((8 * dsum) % 10);
            sum += ((k - 3) / 4) * ((6 * dsum) % 10);
		    System.out.println((sum%3==0)? "YES":"NO");
		    
		}
		
	}
}
