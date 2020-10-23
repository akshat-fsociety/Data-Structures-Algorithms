//https://www.codechef.com/problems/TOWIN
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
		    long sum1=0,sum2=0;
		    for(int i=0; i<n; i++)a[i] = sc.nextInt();
		    Arrays.sort(a);
		    if(n==1)
		        System.out.println("first");
	        else if(n==2)
		    {
		        if(a[0]==a[1])
		            System.out.println("draw");
		        else    
		            System.out.println("first");
		    }
		    else
		    {
		        sum1=a[n-1]-a[n-2];sum2=0;
		        for(int i=n-3;i>=0;--i)
		        {
		            if((n-3-i)%2==0)
		                sum2+=a[i];
		            else        
		                sum2-=a[i];
		        }
		        if(sum2>sum1)
		            System.out.println("second");
		        else if(sum1==sum2)
		            System.out.println("draw");
		        else    
		            System.out.println("first");
		          }
		    }
		    }
		}
	

