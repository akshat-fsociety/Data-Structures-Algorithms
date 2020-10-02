//https://www.codechef.com/OCT20B/problems/CVDRUN
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
		t= sc.nextInt();
		while(t--!=0){
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int f=0;
		    int []city = new int[n];
		    city[0] = x;
		    int i=1;
		    int j= (x+k)%n;
		    while(j != x){
		        city[i] = j;
		        j = (j+k)%n;
		        i++;
		    }
		    for(int e: city){
		        if(e==y){
		            f=1;
		            System.out.println("YES");
		            break;
		        }
		    }
		    if(f == 0)
		    System.out.println("NO");
		}
	}
}
