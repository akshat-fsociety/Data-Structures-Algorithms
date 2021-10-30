// https://practice.geeksforgeeks.org/problems/reverse-level-order-traversal/1#

class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node root) 
    {
        // code here
        ArrayList<Integer>org = new ArrayList<>();
        ArrayList<Integer>reverse = new ArrayList<>();
        Queue<Node>q = new LinkedList<Node>();
        if(root==null)return reverse;
        q.offer(root);
        while(!q.isEmpty()){
           int level = q.size();
           for(int i=0; i<level; i++){
               if(q.peek().right!=null)q.offer(q.peek().right);
               if(q.peek().left!=null)q.offer(q.peek().left);
               org.add(q.poll().data);
           }
        }
        for(int i=org.size()-1; i>=0; i--){
            reverse.add(org.get(i));
        }
        return reverse;
    }
}      
