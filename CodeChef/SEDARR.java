// https://www.codechef.com/LTIME91B/problems/SEDARR

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
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    int a[] = new int[n];
		    int sum=0;
		    for(int i=0; i<n; i++){
		        a[i] = sc.nextInt();
		        sum+=a[i];
		    }
		    System.out.println(sum%k == 0 ? 0 : 1);
		    
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
