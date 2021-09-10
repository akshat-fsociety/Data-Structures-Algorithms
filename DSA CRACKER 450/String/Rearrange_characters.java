// https://practice.geeksforgeeks.org/contest/coding-try-outs-amazon/problems#

/* Idea is simple if the max freq char appears more than (n/2 + n%2) we cannot form else we can form*/

/*first fill all the even places with max char then all the odd places you will get the desired string*/

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
		    String s = sc.next();
		    int n = s.length();
		    int freq[] = new int[26];
		    Arrays.fill(freq, 0);
		    for(int i=0; i<n; i++){
		        char ch = s.charAt(i);
		        freq[ch-'a']++;
		    }
		    char charmax =getcharmax(freq);
		    if(freq[charmax-97] > (n/2)+(n%2)){
		        System.out.println("0");
		    }else{
		        System.out.println("1");
		    }
		}
	}
	public static char getcharmax(int freq[]){
	    int max = -1;
	    char maxchar=' ';
	    for(int i=0; i<26; i++){
	        if(max<freq[i]){
	            max = freq[i];
	            maxchar = (char)('a'+i);
	        }
	    }
	    return maxchar;
	}
}
