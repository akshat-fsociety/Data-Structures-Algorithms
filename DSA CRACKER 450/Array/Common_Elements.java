// https://practice.geeksforgeeks.org/problems/common-elements1132/1


class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // code here 
        ArrayList<Integer> al = new ArrayList<Integer>();
        boolean ans1=false, ans2=false;
        int x = 0;
        for(int i=0; i<n1; i++){
            x = A[i];
            ans1 = bs(B,x);
            ans2 = bs(C,x);
            if(ans1==true && ans2==true && !al.contains(x))
                al.add(x);
        }
        return al;
    }
    public static boolean bs(int a[], int k){
        int start = 0, end = a.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(a[mid] == k)return true;
            else if(k<a[mid]) end = mid-1;
            else start = mid+1;
        }
        return false;
    }
