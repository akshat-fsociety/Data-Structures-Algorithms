//https://codeforces.com/problemset/problem/80/A

import java.util.*;
public class Panoramix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0,m=0;
        if(sc.hasNext())
        {
            n=sc.nextInt();
            m = sc.nextInt();
        }
        arePrimeSequence(n,m);
        sc.close();
    }
public static int nextPrime(int start){
    int next = start+1;

    while(!isPrime(next)){
        next++;
    }

    return next;
}

public static void arePrimeSequence(int r, int s){
    int Prime = nextPrime(r);
    if(s == Prime){
        System.out.println("YES");
    }
    else{
        System.out.println("NO");
    }
}
public static boolean  isPrime(int n){
    if(n%2==0)return false;
    for (int i = 3; i*i <= n; i++) {
        if(n%i==0)return false;
    }
    return true;
}
}
