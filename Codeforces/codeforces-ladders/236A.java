//https://codeforces.com/problemset/problem/263/A
/*
*(c) Akshat Srivastava
*/

import java.io.*;
import java.util.*;
public class beautifulMatrix {
    public static void main(String[] args)throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int m[][] = new int[5][5];
        int r,c,posr=0,posc=0;
        for(r=0; r<5; r++){
            for ( c = 0; c < 5; c++) {
                m[r][c] = sc.nextInt();
                if(m[r][c]==1){
                    posr = r;
                    posc = c;
                }
            }
        }
        System.out.println(Math.abs(2-posr)+Math.abs(2-posc));
    }
}
