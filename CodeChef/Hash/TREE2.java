//https://www.codechef.com/problems/TREE2
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
		while(t-->0){
		    int n = sc.nextInt();
		    int a[] = new int[n];
		    for(int i=0; i<n; i++){
		        a[i] = sc.nextInt();
		    }
		    Set<Integer> set = new HashSet<>();
		    for(int e:a){
		        set.add(e);
		    }
		    if(set.contains(0)){
		        System.out.println(set.size()-1);
		    }else{
		        System.out.println(set.size());
		    }
		}
	}
}
