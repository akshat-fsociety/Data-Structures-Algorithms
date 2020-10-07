//https://www.codechef.com/LRNDSA01/problems/FCTRL
/* package codechef; // don't place package name! */


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t=0;
		if(sc.hasNextInt())
		t = sc.nextInt();
		while(t--!=0){
		    int x = sc.nextInt();
		    int c = 0;
		    while(x>0){
		        c+=(x/5);
		        x/=5;
		    }
		    System.out.println(c);
		}
	}
}
