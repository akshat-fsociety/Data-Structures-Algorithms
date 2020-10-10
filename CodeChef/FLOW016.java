//https://www.codechef.com/problems/FLOW016

/*
*(c) Akshat Srivastava
*/

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
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int g = gcd(a,b);
		    long lcm = (long)(a/g)*(long)b;
		    System.out.println(g+" "+lcm);
		}
	}
	public static int gcd(int a, int b){
	    if (b == 0)
            return a;
        else
            return gcd(b, a % b);
	}
}
