//https://codeforces.com/contest/1426/problem/C
/*
* (c) Saurav Prateek
*/

import java.util.*;
import java.io.*;
public class IncreaseAndCopy {
    public static void main(String[] args) {
        FastReader sc1 = new FastReader();
        StringBuilder sb = new StringBuilder();

        int tc = sc1.nextInt();
        int ch = 0;

        while (ch < tc) {
            int n = sc1.nextInt();
            int req = (int)Math.sqrt((double)n);

            int div = n/req;
            int left = n%req;

            int count = req-1 + div-1;
            if(left > 0){
                count++;
            }
            sb.append(count+"\n"); 
            ch++;
        }

        System.out.print(sb.toString());
    }
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
}