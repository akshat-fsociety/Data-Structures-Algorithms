//https://www.codechef.com/JULY20B/problems/CRDGAME

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t=0; 
		if(sc.hasNextInt())
		t = sc.nextInt();
		int chefcnt,mortycnt;
		while(t--!=0){
            int n = sc.nextInt();
            long a[] = new long[n];
            long b[] = new long[n];
            chefcnt=0;mortycnt=0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                b[i] = sc.nextLong();
            }
            for (int i = 0; i < n; i++) {
                long x = a[i]; long y= b[i];
                long chef = sumOfDigit(x);
                long morty = sumOfDigit(y);
                if(chef>morty)chefcnt++;
                else if(morty>chef)mortycnt++;
                else{
                    chefcnt++;
                    mortycnt++;
                }
            }
            if(chefcnt>mortycnt)System.out.println("0 "+chefcnt);
            else if(mortycnt>chefcnt)System.out.println("1 "+mortycnt);
            else System.out.println("2 "+chefcnt);
        }
        sc.close();
    }
    public static long sumOfDigit(long a){
        long s=0l;
        while(a!=0){
            long d=a%10;
            s+=d;
            a/=10;
        }
        return s;
    }
}
