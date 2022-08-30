// https://practice.geeksforgeeks.org/problems/sort-a-stack/1

class GfG{
	public Stack<Integer> sort(Stack<Integer> s)
	{
		//add code here
		if(!s.isEmpty()){
		    int x = s.pop();
		    sort(s);
		    sortinsert(s,x);
		}
		return s;
	}
	public void sortinsert(Stack<Integer>s, int x){
	    if(s.isEmpty() || s.peek()<x){
	        s.push(x);
	    }else{
	        int temp = s.pop();
	        sortinsert(s,x);
	        s.push(temp);
	    }
	}
}
