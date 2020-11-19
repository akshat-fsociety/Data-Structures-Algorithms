//https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/maximum-sum-4-f8d12458/description/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] = new long[n];
        int c=0; long max = Long.MIN_VALUE; long sum=0l;
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            if(a[i]>=0){
                sum+=a[i];
                c++;
            }
            else{
                max = Math.max(max, a[i]);
            }
        }
        if(c>0)System.out.println(sum+" "+c);
        else System.out.println(max+" "+1);

    }
}
