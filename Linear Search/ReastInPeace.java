//https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/rest-in-peace-21-1/description/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0){
            int n = sc.nextInt();
            if(n%21==0)System.out.println("The streak is broken!");
            else{
                String s = n+"";
                if(s.contains("21"))System.out.println("The streak is broken!");
                else System.out.println("The streak lives still in our heart!");
                    
            }
        }
    }
}
