//https://codeforces.com/contest/1452/problem/C

import java.io.*;
import java.util.*;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
// import java.util.Scanner; 
import java.util.StringTokenizer; 
  
public class C_Two_Brackets
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
            String st = s.nextLine();
            char c[] = st.toCharArray();
            int cr=0, cs=0, ans=0;
            for (char x : c) {
                if(x=='(')cr++;
                if(x=='[')cs++;
                if(x==')'){
                    if(cr>0){
                        cr--;
                        ans++;
                    }
                }
                if(x==']'){
                    if(cs>0){
                        cs--;
                        ans++;
                    }
                }
            }
            System.out.println(ans);
        }   
    } 
} 
