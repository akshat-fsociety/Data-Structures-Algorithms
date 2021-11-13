// https://practice.geeksforgeeks.org/problems/twice-counter4236/1

class Solution
{
    public int countWords(String list[], int n)
    {
        // code here 
        HashMap<String,Integer>hm = new HashMap<>();
        for(int i=0; i<n; i++){
            if(!hm.containsKey(list[i])){
                hm.put(list[i],1);
            }else{
                hm.put(list[i], hm.get(list[i])+1);
            }
        }
        int c=0;
        for(Map.Entry mp: hm.entrySet()){
            int x= (int)mp.getValue();
            if(x==2)c++;
        }
        return c;
    }
}
