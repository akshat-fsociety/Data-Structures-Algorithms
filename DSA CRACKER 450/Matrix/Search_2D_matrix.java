// https://leetcode.com/problems/search-a-2d-matrix/ 

public boolean searchMatrix(int[][] m, int target) {
        int i = 0, j = m[0].length-1; 
        while(i < m.length && j>=0){
            if(m[i][j]==target) return true;
            else if(m[i][j]>target){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }
}
