//https://www.codechef.com/LRNDSA01/problems/CONFLIP
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
		int t =0; 
		if(sc.hasNextInt())
		t = sc.nextInt();
		while(t--!=0){
		    int G = sc.nextInt();
		    while(G--!=0){
		        int I = sc.nextInt();
		        int N = sc.nextInt();
		        int Q = sc.nextInt();
		        int heads = 0;
		        if(N%2==0){
		            heads = N/2;
		        }else{
		            if(I==1){
		                heads = N/2;
		            }else{
		                heads = 1+N/2;
		            }
		        }
		        if(Q==1) System.out.println(heads);
		        else 
		        System.out.println(N-heads);
		    }
		}
	}
}
