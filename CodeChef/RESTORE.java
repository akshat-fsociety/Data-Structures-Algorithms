//https://www.codechef.com/NOV20B/problems/RESTORE

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
		ArrayList<Long>a = new ArrayList<>();
		a = sieve(4000001);
		while(t--!=0){
		    long n = sc.nextLong();
		    int b[] = new int[(int)n];
		    ArrayList<Long>c = new ArrayList<>();
		    ArrayList<Long>d = new ArrayList<>();
		    for (int i=0;i<n;i++ ){
		        b[i] = sc.nextInt();
		    }
		  for (int i=0;i<n;i++){
		      c.add(a.get(i));
		  } 
		  for(int i=0; i<n; i++){
		      if(b[i]!=(i+1)){
		          long x = c.get(b[i]-1);
		          d.add(x);
		      }else 
		      d.add(c.get(i));
		  }
		  for (int i=0;i<n;i++){
		      System.out.print(d.get(i)+" ");
		  } 
		  System.out.println();
		}
	}
	public static ArrayList<Long> sieve(int n) 
    { 
        boolean prime[] = new boolean[n+1]; 
        ArrayList<Long>prime1 = new ArrayList<>();
        for(int i=0;i<n;i++) 
            prime[i] = true; 
          
        for(int p = 2; p*p <=n; p++) 
        {
            if(prime[p] == true) 
            { 
                for(int i = p*p; i <= n; i += p) 
                    prime[i] = false; 
            } 
        }
        for(int i = 2; i <= n; i++) 
        { 
            if(prime[i] == true){ 
                prime1.add((long)i);
            }
        } 
        return prime1;
}
}
