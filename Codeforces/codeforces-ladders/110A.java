//https://codeforces.com/problemset/problem/110/A

import java.util.*;
public class luckyNum {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc= new Scanner(System.in);
        long n=0L;
        if(sc.hasNext())
        n = sc.nextLong();
        int c=0;
        while (n>0) {
            long d = n%10;
            if(d==4 || d==7){
                c++;
            }
            n/=10;
        }
        if(c==4||c==7)
        System.out.println("YES");
        else        
        System.out.println("NO");

        sc.close();
    }
}
