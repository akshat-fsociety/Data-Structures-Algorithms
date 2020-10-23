//https://www.codechef.com/problems/LCH15JAB
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
		  //  int n = sc.nextInt();
		    String s = sc.next();
		    int max=Integer.MIN_VALUE;
		    if(s.length()%2!=0){
		        System.out.println("NO");
		    }
		    else{
		        for(int i=0; i<s.length()-1; i++){
		            int c=1;
		            for(int j=i+1; j<s.length();j++){
		                if(s.charAt(i)==s.charAt(j)){
		                    c++;
		                }
		            }
		            if(max<=c){
		                 max=c;
		            }
		        }
		    if(max==s.length()/2)System.out.println("YES");
		    else System.out.println("NO");
		    }
		}
	}
}
