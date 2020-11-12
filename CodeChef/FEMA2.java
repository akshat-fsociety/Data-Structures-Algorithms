//https://www.codechef.com/NOV20B/problems/FEMA2

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
		    int k = sc.nextInt();
		    String s  = sc.next().toUpperCase();
		    char c[] = s.toCharArray();
		    int i=0,j=0,mag=0,pow=0,sheet;
		    while(i<n && j<n){
		        if(c[i]=='M'){
		            if(c[j]=='I'){
		                sheet = count(i,j,c);
		                pow = power(k, i, j, sheet);
		                if(pow>0){
		                    mag++;
		                    i++;
		                    j++;
		                }else
		                    if(i>j)j++;
		                    else i++;
		            }
		            else if(c[j]=='X'){
		                i=j;
		                i++;
		                j++;
		            }else j++;
		        }
		        else if(c[i]=='X'){
		            j=i;
		            i++;
		            j++;
		        }
		        else i++;
		    }
		    System.out.println(mag);
		    
		}
	}
	public static int count(int i, int j, char c[]){
	    int sheet=0;
	    if(i<j){
    	    for (int x=i;x<j;x++){
    	        if(c[x]==':')sheet++;
    	    }
	    }else if(j<i){
    	    for (int x=j;x<i;x++){
    	        if(c[x]==':')sheet++;
    	    }
	    }
    	    return sheet;
	}
	public static int power(int k, int i, int j, int sheet){
	    return k+1-Math.abs(j-i)-sheet;
	}
}
