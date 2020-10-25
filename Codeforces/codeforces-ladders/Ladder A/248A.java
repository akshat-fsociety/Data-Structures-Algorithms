//https://codeforces.com/problemset/problem/248/A

import java.util.*;
public class cupboards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=0;
        if(sc.hasNext())
        n = sc.nextInt();
        int l[] = new int[n];
        int r []= new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }
        int l1=0,l0=0,r1=0,r0=0;
        for (int i = 0; i < n; i++) {
            if(l[i]==1)
                l1++;
            else if(l[i]==0)
                l0++;
        }
        for (int i = 0; i < n; i++) {
            if(r[i]==1)
                r1++;
            else if(r[i]==0)
                r0++;
        }
        int left,right;
        if(l0<l1){
            left=l0;
        }else{left=l1;}
        if(r0<r1){
            right=r0;
        }else{right=r1;}
        System.out.println(left+right);
        sc.close();
    }
}
