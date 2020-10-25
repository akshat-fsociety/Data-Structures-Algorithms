//https://codeforces.com/contest/1426/problem/D
/*
* (c) Saurav Prateek
*/

import java.util.*;
import java.io.*;
public class NonZeroSegments {
    public static int[] nextArray(FastReader sc1, int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc1.nextInt();
        }
        return arr;
    }
    public static void main(String[] args) {
        FastReader sc1 = new FastReader();
        StringBuilder sb = new StringBuilder();

        int n = sc1.nextInt();
        int[] arr = nextArray(sc1, n);

        long[] pref = new long[n];
        HashMap<Long, Integer> map = new HashMap<>();
        int pind = -1;
        int count = 0;

        for(int i=0; i<n; i++){
            if(i==0){
                pref[i] = arr[i];
                map.put(pref[i], i);
            }
            else{
                pref[i] = pref[i-1] + arr[i];
                int early = -1;
                if(map.containsKey(pref[i])){
                    early = map.get(pref[i]);
                }

                if(early != -1 && early+1 >= pind){
                    count++;
                    pind = i;
                }
                else{
                    if(pref[i] == 0 && pind == -1){
                        count++;
                        pind = i;
                    }
                }

                map.put(pref[i], i);
            }
        }
        System.out.print(count);
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
