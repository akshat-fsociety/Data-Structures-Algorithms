//https://codeforces.com/problemset/problem/4/C

import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner; 
import java.util.StringTokenizer;

public class register {
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
        int t = s.nextInt();
        HashMap<String, Integer> hm = new HashMap<>();
        while (t-- != 0) {
            String st = s.nextLine();
            if (!hm.containsKey(st)) {
                System.out.println("OK");
                hm.put(st, 1);
            } else {
                System.out.println(st + "" + hm.get(st));
                hm.put(st, hm.get(st) + 1);
            }
        }
    }
}
