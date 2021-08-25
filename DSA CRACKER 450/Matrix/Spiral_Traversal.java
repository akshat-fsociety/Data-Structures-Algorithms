// https://practice.geeksforgeeks.org/problems/spirally-traversing-a-matrix-1587115621/1

class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int a[][], int r, int c)
    {
        // code here 
        ArrayList<Integer> ans = new ArrayList<>();
        int k = 0, l=0;
        while(k<r && l<c){
            
            // Print the first row
            for(int i=l; i<c; i++){
                ans.add(a[k][i]);
            }
            k++;
            
            //Print the last col
            for(int i=k; i<r; i++){
                ans.add(a[i][c-1]);
            }
            c--;
            
            
            // Print the last rem row
            if(k<r){
                for(int i=c-1; i>=l; i--){
                    ans.add(a[r-1][i]);
                }
                r--;
            }
            
            // Print the first rem col
            if(l<c){
                for(int i=r-1; i>=k; i--){
                    ans.add(a[i][l]);
                }
                l++;
            }
        }
        return ans;
    }
}
