//https://codeforces.com/problemset/problem/525/A

import java.io.*;
import java.util.Scanner; 
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class vital {

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
        int n = s.nextInt();
        String st = s.nextLine().toLowerCase();
        int key=0;
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < st.length(); i++) {
            char c = st.charAt(i);
            if (i % 2 == 0) {
                if (!hm.containsKey(c))
                    hm.put(c, 1);
                else
                    hm.put(c, hm.get(c) + 1);
            }else {
                if(!hm.containsKey(c))key++;
                else if(hm.containsKey(c) && hm.get(c)==0)key++;
                else hm.put(c, hm.get(c)-1);
            }
        }
        System.out.println(key);
    }
}
