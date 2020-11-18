//https://codeforces.com/contest/1440/problem/A

import java.io.*;
import java.util.*;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer; 
  
public class buy
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
        while(t--!=0){
            int n = s.nextInt();
            int c0 = s.nextInt();
            int c1 = s.nextInt();
            int h = s.nextInt();
            int one=0, zero=0, ans=0;
            String st = s.nextLine();
            for (int i = 0; i < n; i++) {
                if(st.charAt(i)=='1')one++;
                else zero++;
            }
            if(c0==c1){
                ans = n*c0;
                System.out.println(ans);
            }
            else{
                ans = zero*Math.min(c0, c1+h) + one*Math.min(c1, c0+h);
                System.out.println(ans);
            }
        }   
    } 
} 
