//https://www.codechef.com/JAN21C/problems/BILLRD

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
		  long n=sc.nextLong(); 
          long k=sc.nextLong();
          long x=sc.nextLong();
          long y=sc.nextLong();
          ArrayList<Long>xg = new ArrayList<>();
          ArrayList<Long>ys = new ArrayList<>();
          ArrayList<Long>xs = new ArrayList<>();
          ArrayList<Long>yg = new ArrayList<>();
          if(x==y){
              System.out.println(n+" "+n);
          }
          else if(x>y){
              xg.add(n);
              xg.add(n-x+y);
              xg.add(0l);
              xg.add(x-y);
              
              ys.add(n-x+y);
              ys.add(n);
              ys.add(x-y);
              ys.add(0l);
              System.out.println(xg.get((int)(k-1)%4)+" "+ys.get((int)(k-1)%4));
          }
          else if(y>x){
              xs.add(n+x-y);
              xs.add(n);
              xs.add(y-x);
              xs.add(0l);
              
              yg.add(n);
              yg.add(n+x-y);
              yg.add(0l);
              yg.add(y-x);
              System.out.println(xs.get((int)(k-1)%4)+" "+yg.get((int)(k-1)%4));
          }
		    
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
