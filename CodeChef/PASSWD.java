// https://www.codechef.com/problems/PASSWD

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
		  String str =  sc.next();
		  boolean spl=false, lw=false, up=false, num=false, len=false; int l;
		  l = str.length();
		  if(l>=10)len=true;
    		  for(int i=0; i<l; i++){
    		      char x = str.charAt(i);
    		      if(x>='a' && x<='z')lw=true;
    		      if(i!=0 && i!=l-1){
        		      if(x>='A' && x<='Z')up=true;
        		      if(x=='@'|| x=='#' || x=='%' || x=='&' || x=='?')spl=true;
        		      if(x>='0' && x<='9')num=true;
    		      }
    		  }
    		  if(lw==true && up==true && spl==true && num==true && len==true){
    		      System.out.println("YES");
    		  }else{
    		      System.out.println("NO");
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
