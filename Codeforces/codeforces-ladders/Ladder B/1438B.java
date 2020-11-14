//https://codeforces.com/contest/1438/problem/B

import java.io.*;
import java.util.*;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
// import java.util.Scanner; 
import java.util.StringTokenizer; 
  
public class valerii 
{ 
    static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        FastReader s=new FastReader(); 
        int t = s.nextInt(); 
        while (t--!=0) 
        { 
            int n = s.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];
            int f=0;
            for (int i = 0; i < n; i++)b[i] = s.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = i+1; j < n; j++) {
                    if(b[i]==b[j]){
                        f=1;break;
                    }
                }
            }
            if(f==1)System.out.println("YES");
            else if(f==0) System.out.println("NO");
        } 
    } 
} 
