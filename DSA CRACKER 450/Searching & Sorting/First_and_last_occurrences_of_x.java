// https://practice.geeksforgeeks.org/problems/first-and-last-occurrences-of-x3116/1

class GFG
{
    ArrayList<Long> find(long a[], int n, int x)
    {
        // code here
        ArrayList<Long> ans = new ArrayList<>();
        int start = 0, end = n-1;
        long first=-1, last=-1;
      
      // This Binary Search will find the first Occurrence of x
        while(start<=end){
            int mid = start+(end-start)/2;
            if(x==a[mid]){
                first = mid;
                end = mid-1;
            }else if(x>a[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
      
      // This Binary Search will find the last Occurrence of x
        start = 0; end = n-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(x==a[mid]){
                last = mid;
                start = mid+1;
            }else if(x>a[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        ans.add(first);
        ans.add(last);
        return ans;
    }
}

