//https://www.codechef.com/LRNDSA01/problems/CARVANS
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
		int t =0;
		if(sc.hasNextInt())
		t = sc.nextInt();
		while(t--!=0){
		    int cars = sc.nextInt();
		    int a[] = new int[cars];
		    for(int i=0; i<cars; i++){
		        a[i] = sc.nextInt();
		    }
		    if(cars==1){
		        System.out.println(1);
		    }else{
		    int p = a[0]; 
		    int c=0;
		    for(int j=0; j<cars; j++){
		      if(p>=a[j]){
		          p = a[j];
		          c++;
		      }
		  }
		  System.out.println(c);
		    }  
		}
	}
}
