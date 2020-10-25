//https://codeforces.com/problemset/problem/281/A

import java.io.*;
import java.util.*;
public class wordCap {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s="";
        if(sc.hasNext())
        s = sc.nextLine();
        System.out.println(s.substring(0,1).toUpperCase()+s.substring(1));
        sc.close();
    }
}
