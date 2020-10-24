//https://codeforces.com/problemset/problem/155/A

import java.io.*;
import java.util.*;
public class i_love_username {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=0;
        if(sc.hasNext())
        n = sc.nextInt();
        int a[] = new int[n];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minc=0,maxc=0;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        min=a[0]; max=a[0];
        for (int i = 1; i < a.length; i++) {
            if(min>a[i]){
                min=a[i];
                minc++;
            }
            else if(max<a[i]){
                max=a[i];
                maxc++;
            }
        }
        System.out.println(minc+maxc);
        sc.close();
    }
}
