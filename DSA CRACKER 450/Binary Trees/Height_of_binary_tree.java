// https://practice.geeksforgeeks.org/problems/height-of-binary-tree/1

class Solution {
    //Function to find the height of a binary tree.
    int height(Node root) 
    {
        // code here 
        if(root==null)return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        return 1+Math.max(lh, rh);
    }
}
