//https://codeforces.com/contest/1426/problem/E
/*
* (c) Saurav Prateek
*/

import java.util.*;
import java.io.*;
public class RockPaperScissors {
    public static int max1 = 0;
    public static void compute(int[] al, int[] be, int[] vis, int cval){
        int allv = 1;
        for(int i=1; i<=6; i++){
            if(vis[i] == 0){
                vis[i] = 1;
                if(i==1){
                    int addv  =  Math.min(al[0], be[0]);
                    int nval = cval + addv;
                    al[0] -= addv;
                    be[0] -= addv;
                    compute(al,be,vis,nval);
                    al[0] += addv;
                    be[0] += addv;
                }
                else if(i==2){
                    int addv = Math.min(al[0], be[2]);
                    int nval = cval + addv;
                    al[0] -= addv;
                    be[2] -= addv;
                    compute(al,be,vis,nval);
                    al[0] += addv;
                    be[2] += addv;
                } 
                else if(i==3){
                    int addv = Math.min(al[1], be[0]);
                    int nval = cval + addv;
                    al[1] -= addv;
                    be[0] -= addv;
                    compute(al,be,vis,nval);
                    al[1] += addv;
                    be[0] += addv;
                }
                else if(i==4){
                    int addv = Math.min(al[1], be[1]);
                    int nval = cval + addv;
                    al[1] -= addv;
                    be[1] -= addv;
                    compute(al,be,vis,nval);
                    al[1] += addv;
                    be[1] += addv;
                }
                else if(i==5){
                    int addv = Math.min(al[2], be[1]);
                    int nval = cval + addv;
                    al[2] -= addv;
                    be[1] -= addv;
                    compute(al,be,vis,nval);
                    al[2] += addv;
                    be[1] += addv;
                }
                else if(i==6){
                    int addv = Math.min(al[2], be[2]);
                    int nval = cval + addv;
                    al[2] -= addv;
                    be[2] -= addv;
                    compute(al,be,vis,nval);
                    al[2] += addv;
                    be[2] += addv;
                }
                allv = 0;
                vis[i] = 0;
            }
        }

        if(allv == 1){
            max1 = Math.max(max1, cval);
        }
    }
    public static void main(String[] args) {
        FastReader sc1 = new FastReader();

        int n = sc1.nextInt();
        int[] al = new int[3];
        int[] be = new int[3];

        al[0] = sc1.nextInt();
        al[1] = sc1.nextInt();
        al[2] = sc1.nextInt();

        be[0] = sc1.nextInt();
        be[1] = sc1.nextInt();
        be[2] = sc1.nextInt();

        int[] vis = new int[7];
        int[] oal = new int[3];
        int[] obe = new int[3];

        for(int i=0; i<3; i++){
            oal[i] = al[i];
            obe[i] = be[i];
        }

        compute(al,be,vis,0);

        max1 = n - max1;
        int max2 = Math.min(oal[0], obe[1]) + Math.min(oal[1], obe[2]) + Math.min(oal[2], obe[0]);
        System.out.print(max1+" "+max2);
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
