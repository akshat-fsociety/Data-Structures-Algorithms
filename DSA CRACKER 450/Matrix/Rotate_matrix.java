class Solution {
    public void rotate(int[][] a) {
        
      // TRANSPOSE
        for(int r=0; r<a.length; r++){
            for(int c=r; c<a[0].length; c++){
                int t = a[r][c];
                a[r][c] = a[c][r];
                a[c][r] = t;
            }
        }
      
      // REVERSE EACH ROW
        for(int r=0; r<a.length; r++){
            for(int c=0; c<a[0].length/2; c++){
                int t = a[r][c];
                a[r][c] = a[r][a.length-1-c];
                a[r][a.length-1-c] = t;
            }
        }
      
      //DISPLAY
        for(int r=0; r<a.length; r++){
            for(int c=0; c<a[0].length; c++){
                System.out.print(a[r][c]+" ");
            }
            System.out.println();
        }
    }
}
