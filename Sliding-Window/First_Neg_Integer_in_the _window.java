//https://practice.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k/0/?category[]=sliding-window&problemStatus=unsolved&page=1&query=category[]sliding-windowproblemStatusunsolvedpage1

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
    	Scanner sc = new Scanner(System.in);
    	int t=0;
    	if(sc.hasNext())
		    t = sc.nextInt();
		while(t--!=0){
		    int n = sc.nextInt();
		    int a[] = new int[n];
		    for(int x=0; x<n; x++)a[x] = sc.nextInt();
		    int k = sc.nextInt();
		    Queue<Integer>q = new LinkedList<>();
		    for(int i=0; i<k; i++){
		        if(a[i]<0)
		        q.offer(i); //Adding the index of -ve element
		    } // Running till the size of window
		    for(int i=k; i<n; i++){
		        if(!q.isEmpty())
		            System.out.print(a[q.peek()]+" "); //if q is not empty display the -ve term
		        else
		            System.out.print(0+" ");
		        
		        
		        while(!q.isEmpty() && q.peek()<i-k+1){ // Out from window range
		            q.poll();
		        }
		        
		        if(a[i]<0)
		            q.offer(i);
		    }
		    
		    if(!q.isEmpty()) 
		        System.out.print(a[q.peek()]+" ");
	        else
	            System.out.print(0+" ");
	       System.out.println();
		}
	}
}

