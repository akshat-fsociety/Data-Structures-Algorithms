// https://practice.geeksforgeeks.org/problems/left-view-of-binary-tree/1

class Tree
{
      //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here()
        ArrayList<Integer> ans = new ArrayList<>();
        printleft(root, ans, 0);
        return ans;
        
    }
    void printleft(Node root, ArrayList<Integer> al, int level){
        if(root == null)return;
        if(al.size()==level)al.add(root.data);
        printleft(root.left, al,level+1);
        printleft(root.right, al,level+1);
    }
}
