// https://practice.geeksforgeeks.org/problems/diagonal-traversal-of-binary-tree/1/

class Tree
{
     public ArrayList<Integer> diagonal(Node root)
      {
           //add your code here.
           ArrayList<Integer>ans = new ArrayList<>();
           Queue<Node>q = new LinkedList<>();
           q.add(root);
           while(!q.isEmpty()){
               Node temp = q.remove();
               while(temp!=null){
                   if(temp.left!=null)q.add(temp.left);
                   ans.add(temp.data);
                   temp = temp.right;
               }
           }
           return ans;
      }
}
