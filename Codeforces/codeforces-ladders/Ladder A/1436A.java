//https://codeforces.com/contest/1436/problem/A

import java.util.*;
public class reorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=0; 
        if(sc.hasNext())
        t = sc.nextInt();
        while(t--!=0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a;
            int s=0;
            for(int i=1; i<=n; i++){
                a = sc.nextInt();
                s+=a;
            }
            if(s==m)System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
