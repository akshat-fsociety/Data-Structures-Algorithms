//https://codeforces.com/contest/1426/problem/A
/*
* (c) Saurav Prateek
*/

import java.util.*;
import java.io.*;
public class FloorNumber {
    public static void main(String[] args) {
        FastReader sc1 = new FastReader();
        StringBuilder sb = new StringBuilder();

        int tc = sc1.nextInt();
        int ch = 0;

        while (ch < tc) {
            int n = sc1.nextInt();
            int x = sc1.nextInt();

            int st = 1;
            int en = 2;
            int floor = 1;

            while(true){
                if(n>=st && n<=en){
                    break;
                }
                floor++;
                st = en+1;
                en = st+x-1;
            }
            sb.append(floor+"\n");
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
