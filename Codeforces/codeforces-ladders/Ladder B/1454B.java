//https://codeforces.com/contest/1454/problem/B

import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.util.Scanner; 
import java.util.StringTokenizer;

public class test {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        FastReader s = new FastReader();
        long t = s.nextLong();
        while (t-- != 0) {
            int n = s.nextInt();
            int a[] = new int[n];                          //array
            int v[] = new int[n + 1];                      //frequency array
            int min = (int) 1e9;
            int ans = -1;
                for (int i = 0; i < n; i++) {
                    a[i] = s.nextInt();
                    v[a[i]]++;
                }
                for (int i = 0; i < n; i++) {
                    if (v[a[i]] == 1) {
                        if(min>a[i]){
                            ans=i+1;
                            min = a[i];
                        }
                    }
                }
                System.out.println(ans);
        }
    }
}
