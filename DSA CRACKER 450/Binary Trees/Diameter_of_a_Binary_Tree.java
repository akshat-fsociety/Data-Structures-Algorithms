// https://practice.geeksforgeeks.org/problems/diameter-of-binary-tree/1

class Solution {
    // Function to return the diameter of a Binary Tree.
    int max = 0;
    int diameter(Node root) {
        // Your code here
        maxDepth(root);
        return max+1;
    }
    public int maxDepth(Node root){
        if(root==null)return 0;
        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);
        max = Math.max(max, (lh+rh));
        return 1+Math.max(lh,rh);
    }
}
