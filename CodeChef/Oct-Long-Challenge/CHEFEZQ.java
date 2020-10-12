//https://www.codechef.com/OCT20B/problems/CHEFEZQ

import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
 public static void main (String[] args) throws java.lang.Exception
 {
  Scanner sc = new Scanner(System.in);
  long t=0;
  if(sc.hasNext())
  t = sc.nextLong();
  while(t--!=0){
      int n = sc.nextInt();
      long k = sc.nextLong();
      long a[] = new long[n];
         long sum=0,day=0,f=0;
          for(int i=0;i<n;i++){
              a[i] = sc.nextLong();
              sum += a[i];
          }
      
      for(int i=0;i<n-1;i++){
          if(a[i] < k){
              f =1;
              day=i;
              break;
          }
          a[i+1] += (a[i]-k);
       }
       
        
           if(f == 1){
               System.out.println(day+1);
           }
           else{
                     day = (sum / k)+1;
               System.out.println(day);
           }
      }
 }
}
