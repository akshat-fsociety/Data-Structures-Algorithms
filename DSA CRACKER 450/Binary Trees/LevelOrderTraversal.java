// https://practice.geeksforgeeks.org/problems/level-order-traversal/1

class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node root) 
    {
        // Your code here
        ArrayList<Integer> inorder = new ArrayList<>();
        Queue<Node> q = new LinkedList<Node>();
        if(root==null) return inorder;
        q.offer(root);
        while(!q.isEmpty()){
            root = q.poll();
            inorder.add(root.data);
            if(root.left!=null)
                q.offer(root.left);
            if(root.right!=null)
                q.offer(root.right);
        }
        return inorder;
    }
}
