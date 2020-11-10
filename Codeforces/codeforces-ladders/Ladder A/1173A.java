//https://codeforces.com/contest/1173/problem/A

// import java.io.*;
// import java.util.*;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
// import java.util.Scanner; 
import java.util.StringTokenizer; 
  
public class nauuoAndVotes
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
        int x = s.nextInt();
        int y = s.nextInt();
        int z = s.nextInt();
        int up = x+z;
        int down = y+z;
        if(x>y){
            if(x<=down)
            System.out.println("?");
            else System.out.println("+");
        }
        else if(y>x){
            if(y<=up)
            System.out.println("?");
            else System.out.println("-");
        }
        else{
            if(z==0)System.out.println("0");
            else System.out.println("?");
        } 
    } 
} 
