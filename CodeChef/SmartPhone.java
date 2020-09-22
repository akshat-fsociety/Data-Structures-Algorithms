//https://www.codechef.com/LRNDSA01/problems/ZCO14003
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
		int users = 0;
		if(sc.hasNextInt())
		users = sc.nextInt();
		int b[] = new int[users];
		for(int i=0; i<users; i++){
		    b[i] = sc.nextInt(); 
		}
		Arrays.sort(b);
		long t =0L;
		for(int i=0; i<users; i++){
		    long max = (long)b[i]*(users-i);
		    if(max>t)
		    t = max; 
		}
		System.out.println(t);
	}
}
