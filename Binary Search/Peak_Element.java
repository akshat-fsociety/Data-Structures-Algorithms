class Solution
{
    public int findPeakElement(List<Integer> a)
    {
        int start = 0, end = a.size()-1;
        if(a.size() == 1)return a.get(0);            // if size is 1 return that elem
        
        while(start<=end){
            int mid = start+(end-start)/2;
            
            if(mid>0 && mid<a.size()-1){
                if(a.get(mid)>a.get(mid-1) && a.get(mid)>a.get(mid+1))
                return a.get(mid);
                else if(a.get(mid-1)>a.get(mid)) end = mid-1;
                else start = mid+1;
            }
            else if(mid==0){
                if(a.get(0)>a.get(1))return a.get(0);
                else return a.get(1);
            }
            else if(mid==a.size()-1){
                if(a.get(a.size()-1)>a.get(a.size()-2))return a.get(a.size()-1);
                else return a.get(a.size()-2);
            }
        }
        return -1;
    }
