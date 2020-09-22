import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
		while(t-->0){
		    String s = sc.nextLine();
		    String left,right=""; int flag=0;
		    int l = s.length();
		    int div = l/2;
		    left = s.substring(0,div);
            if(l%2!=0){
		        right = s.substring((div+1),l);
		    }else{
		        right = s.substring(div,l);
		    }
		    char a[] = left.toCharArray();
		    Arrays.sort(a);
		    char b[] = right.toCharArray();
		    Arrays.sort(b);
		    for (int j=0;j<div;j++){
		        if(a[j]!=b[j]){
		            System.out.println("NO");
		            flag=1;
		            break;
		        }
		    }
		    if(flag==0)
		    {
		        System.out.println("YES");
		    }
		}
	}
}
