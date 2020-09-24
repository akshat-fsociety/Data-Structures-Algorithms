//https://www.codechef.com/LRNDSA01/problems/LADDU
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		    Scanner sc = new Scanner(System.in);
		    long t = sc.nextLong();
		    
		    while(t--!=0) {
		        long activites = sc.nextLong();
		        String origin = sc.next();
		        long laddus = 0;
		        long j=0;
		        for(; j < activites; j++) {
		            String act = sc.next();
		            
		            if(act.equals("CONTEST_WON")) {
		                long rank = sc.nextLong();
		                if(rank <= 20) {
		                    laddus += (320 - rank);
		                } else {
		                    laddus += 300;
		                }
		            } else if(act.equals("TOP_CONTRIBUTOR")) {
		                laddus += 300;
		            } else if(act.equals("BUG_FOUND")) {
		                long x = sc.nextLong();
		                laddus += x;
		            } else  {
		                laddus += 50;
		            }
		            
		            
		        }
		        System.out.println(origin.equals("INDIAN")? (laddus/200):(laddus/400));
		    }
		
	}
}
