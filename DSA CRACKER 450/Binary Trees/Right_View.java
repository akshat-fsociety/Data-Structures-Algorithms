// https://practice.geeksforgeeks.org/problems/right-view-of-binary-tree/1

class Solution{
    //Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node node) {
        //add code here.
        ArrayList<Integer>ans = new ArrayList<>();
        right(node, ans, 0);
        return ans;
    }
    void right(Node root, ArrayList<Integer>ans, int level){
        if(root==null)return;
        if(ans.size()==level)
            ans.add(root.data);
        right(root.right,ans,level+1);
        right(root.left,ans,level+1);
    }
}
