// https://www.codechef.com/LTIME92C/problems/SUMPOS

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t=0; 
		if(sc.hasNextInt())
		t = sc.nextInt();
		while(t--!=0){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int z = sc.nextInt();
		    if(x+y==z)System.out.println("YES");
		    else if(x+z==y)System.out.println("YES");
		    else if(y+z==x)System.out.println("YES");
		    else if(y+z==x)System.out.println("YES");
		    else System.out.println("NO");
		    
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
    public static int[] sievearr(int n) 
    { 
        boolean prime[] = new boolean[n+1]; 
        int primex[] = new int[n+1];
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
                primex[i]=i;
            }
        } 
        return primex;
    }
    public static int[] sortdes(int a[]){
        Arrays.sort(a);
        int des[] = new int[a.length];
        int ind=a.length-1;
        for(int e:a){
            des[ind--]=e;
        }
        return des;
    }
}
