// https://practice.geeksforgeeks.org/problems/the-celebrity-problem/1

class Solution
{ 
    boolean knows(int m[][], int a,int b){
        if(m[a][b]==1)return true;
        else return false;
    }
  
    int celebrity(int m[][], int n)
    {
    	// code here
    	Stack<Integer>s = new Stack<>();
    	for(int i=0; i<n; i++)
    	    s.push(i);
    	
    	while(s.size()>1){
    	    int a = s.peek();
    	    s.pop();
    	    
    	    int b = s.peek();
    	    s.pop();
    	     
    	    if(knows(m,a,b)==true)  // if a knows b the push b in stack 
    	    s.push(b);
    	    
    	    else 
    	    s.push(a);
    	}
    	
    	int ans = s.peek();
        int countzero=0,countone=0;
        for(int i=0; i<n; i++){
            if(m[ans][i]==0)countzero++;
        }
        if(countzero!=n)return -1;
        
        for(int i=0; i<n; i++){
            if(m[i][ans]==1)countone++;
        }
        if(countone!=n-1)return -1;
        
        return ans;
    }
}
