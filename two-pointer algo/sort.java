/*Given an array A of size N containing 0s, 1s, and 2s; you need to sort the array in ascending order

Input:
The first line contains an integer 'T' denoting the total number of test cases. Then T testcases follow. Each testcases contains two lines of input. The first line denotes the size of the array N. The second lines contains the elements of the array A separated by spaces.

Output: 
For each testcase, print the sorted array.

Constraints:
1 <= T <= 500
1 <= N <= 106
0 <= Ai <= 2

Example:
Input :
2
5
0 2 1 2 0
3
0 1 0

Output:
0 0 1 2 2
0 0 1

Explanation:
Testcase 1: After segragating the 0s, 1s and 2s, we have 0 0 1 2 2 which shown in the output.*/



import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int i;
		int t = sc.nextInt();
		while(t>0){
		    int n=sc.nextInt();;
		    int a[] = new int[n];
		    
		    for(i=0;i<n;i++){
		        a[i] = sc.nextInt();
		    }
            Arrays.sort(a);  //sorting with the time complexity of O(nlog(n))
            for(int e:a)
            System.out.print(e+" ");
            System.out.println();
             t--;
		}
	}
}
