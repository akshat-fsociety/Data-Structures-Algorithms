import java.io.*;
import java.util.*;
import java.lang.*;

public class qSchool {
    public static void main(String[] args) throws java.lang.Exception  {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        String s = sc.next();
        char c[] = s.toCharArray();
        while (t--!=0) {
            for (int i = 1; i < n;) {
                if (c[i-1] == 'B' && c[i] == 'G') {
                    c[i] = 'B';
                    c[i-1] = 'G';
                    i+=2;
                }else
                  i++;
            }
        }
        for (char d : c) {
            System.out.print(d);
        }
        sc.close();
    }
}
