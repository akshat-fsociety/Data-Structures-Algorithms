//https://codeforces.com/contest/1397/problem/A

import java.io.*;
import java.util.*;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
// import java.util.Scanner; 
import java.util.StringTokenizer; 
  
public class juggling
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
            String str[] = new String[n];
            for (int i = 0; i < n; i++) {
                str[i] = s.nextLine();
            }
            int alpha[] = new int[26];
            Arrays.fill(alpha,0);
            for (int i = 0; i < n; i++) {
                String st = str[i];
                for (int j = 0; j < st.length(); j++) {
                    char x = st.charAt(j);
                    alpha[x-97]++;
                }
            }
            int f=0;
            for (int i = 0; i < 26; i++) {
                if(alpha[i]>0){
                    if(alpha[i]%n!=0){
                        f=1;
                        System.out.println("NO");
                        break;
                    }
                }
            }
            if(f==0)System.out.println("YES"); 
        }
    }
} 
