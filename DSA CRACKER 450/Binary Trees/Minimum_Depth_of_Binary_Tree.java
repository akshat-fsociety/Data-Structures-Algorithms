// https://leetcode.com/problems/minimum-depth-of-binary-tree/

class Solution {
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 1;
        if(root.left==null) return 1+minDepth(root.right);
        if(root.right==null) return 1+minDepth(root.left);
        int lh = minDepth(root.left);
        int rh = minDepth(root.right);
        return 1+Math.min(lh,rh);
    }
}
