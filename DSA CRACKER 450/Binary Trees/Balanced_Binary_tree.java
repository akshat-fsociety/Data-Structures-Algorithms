// https://practice.geeksforgeeks.org/problems/check-for-balanced-tree/1

class Tree
{
    
    //Function to check whether a binary tree is balanced or not.
    boolean isBalanced(Node root)
    {
	// Your code here
	if(height(root)!=-1)
	    return true;
	  else
	  return false;
    }
    int height(Node root){
        if(root==null)return 0;
        int lh = height(root.left);
        if(lh==-1)return -1;
        int rh = height(root.right);
        if(rh==-1)return -1;
        if(Math.abs(lh-rh)>1)return -1;
        return 1+Math.max(lh,rh);
    }
}
