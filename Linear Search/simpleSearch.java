//https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/simple-search-4/description/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++)a[i] = s.nextInt();
        int k = s.nextInt();
        for(int i=0; i<n; i++){
            if(a[i]==k){
                System.out.println(i);
            }
        }

    }
}
