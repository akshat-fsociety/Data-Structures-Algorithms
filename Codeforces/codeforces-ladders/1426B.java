//https://codeforces.com/contest/1426/problem/B
/*
* (c) Saurav Prateek
*/

import java.util.*;
import java.io.*;
public class SymmetricMatrix {
    public static void main(String[] args) {
        FastReader sc1 = new FastReader();
        StringBuilder sb = new StringBuilder();

        int tc = sc1.nextInt();
        int ch = 0;

        while (ch < tc) {
            int n = sc1.nextInt();
            int m = sc1.nextInt();

            int sym = 0;
            for(int i=0; i<n; i++){
                int a = sc1.nextInt();
                int b = sc1.nextInt();
                int c = sc1.nextInt();
                int d = sc1.nextInt();

                if(c == b){
                    sym = 1;
                }
            }

            if(m%2==0 && sym == 1){
                sb.append("YES\n");
            }
            else{
                sb.append("NO\n");
            }
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