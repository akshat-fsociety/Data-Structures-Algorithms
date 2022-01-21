// https://practice.geeksforgeeks.org/problems/boundary-traversal-of-binary-tree/1

class Solution
{
	ArrayList <Integer> boundary(Node node)
	{
	    ArrayList<Integer>ans = new ArrayList<>();
	    if(isLeaf(node)==false)ans.add(node.data);
	    addLeftBoundary(node, ans);
	    addLeaves(node, ans);
	    addRightBoundary(node, ans);
	    return ans;
	}
	boolean isLeaf(Node root){
	    if(root.left==null && root.right==null)return true;
	    else return false;
	}
	void addLeftBoundary(Node root, ArrayList<Integer>res){
	    Node cur = root.left;
	    while(cur!=null){
	        if(isLeaf(cur)==false)res.add(cur.data);
	        if(cur.left!=null)cur = cur.left;
	        else cur = cur.right;
	    }
	}
	void addLeaves(Node root, ArrayList<Integer>res){
	    if(isLeaf(root)){
	        res.add(root.data);
	        return;
	    }
	    if(root.left!=null)addLeaves(root.left, res);
	    if(root.right!=null)addLeaves(root.right, res);
	}
	void addRightBoundary(Node root, ArrayList<Integer>res){
	    Node cur = root.right;
	    ArrayList<Integer>temp = new ArrayList<>();
	    while(cur!=null){
	        if(isLeaf(cur)==false)temp.add(cur.data);
	        if(cur.right!=null)cur = cur.right;
	        else cur = cur.left;
	    }
	    for(int i=temp.size()-1; i>=0; i--){
	        res.add(temp.get(i));
	    }
	}
}
