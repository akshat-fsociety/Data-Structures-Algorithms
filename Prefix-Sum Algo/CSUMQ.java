import java.util.*;
import java.lang.*;

class csumq
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n=0, q=0;
		if(sc.hasNext())
		n = sc.nextInt();
		int a[] = new int[n];
    
        for(int i=0; i<n; i++) a[i] = sc.nextInt();
        
		for(int i=1; i<n; i++) a[i] = a[i-1]+a[i];
    
		if(sc.hasNext())
			q= sc.nextInt();
      
		while(q--!=0){
			int x = sc.nextInt();
      int y = sc.nextInt();
			if(x==0 || y==0)System.out.println(a[y]);
			else System.out.println(a[y]-a[x-1]);
		}
    
		sc.close();
	}
}
