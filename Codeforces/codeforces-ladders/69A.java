//https://codeforces.com/problemset/problem/69/A
/*
* (c) Akshat Srivastava
*/

import java.io.*;
import java.util.*;
public class YoungPhysicist {
    public static void main(String[] args)throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n=0;
        if(sc.hasNext())
        n = sc.nextInt();
        int xa=0,ya=0,za=0;
        for (int i = 1; i <=n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            xa+=x;
            ya+=y;
            za+=z;
        }
        if(xa==0 && ya==0 && za==0)
        System.out.println("YES");
        else 
        System.out.println("NO");
    }
}
