// https://practice.geeksforgeeks.org/problems/sorted-matrix2333/1

class Solution {
    int[][] sortedMatrix(int n, int a[][]) {
        // code here
        ArrayList<Integer>al = new ArrayList<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                al.add(a[i][j]);
            }
        }
        Collections.sort(al);
        int ind = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                a[i][j] = al.get(ind++);
            }
        }
        return a;
    }
}
