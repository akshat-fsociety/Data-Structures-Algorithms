// https://leetcode.com/problems/set-matrix-zeroes/submissions/

class Solution {
    public void setZeroes(int[][] a) {
        int rows[] = new int[a.length];
        int cols[] = new int[a[0].length];
        Arrays.fill(rows, -1);
        Arrays.fill(cols, -1);
        
        for(int r=0; r<a.length; r++){
            for(int c=0; c<a[0].length; c++){
                if(a[r][c]==0){
                    rows[r] = 0;
                    cols[c] = 0;
                }
            }
        }
   
        int c_0 = 0;
        for(int c=0; c<a[0].length; c++){
            if(cols[c]==0){
                c_0 = c;
                for(int r=0; r<a.length; r++){
                    a[r][c_0] = 0;
                }
            }
        }
        
        int r_0 = 0;
        for(int r=0; r<a.length; r++){
            if(rows[r]==0){
                r_0 = r;
                for(int c=0; c<a[0].length; c++){
                    a[r_0][c] = 0;
                }
            }
        }
        
        for(int r=0; r<a.length; r++){
            for(int c=0; c<a[0].length; c++){
                System.out.print(a[r][c]+" ");
            }
        }
        
    }
}
