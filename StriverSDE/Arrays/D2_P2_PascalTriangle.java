// https://leetcode.com/problems/pascals-triangle/submissions/

class Solution {
    public List<List<Integer>> generate(int n) {
      
        List<List<Integer>> allRows = new ArrayList<List<Integer>>();
        List<Integer> row = new ArrayList<>();
      
        for(int i=0; i<n; i++){
            row.add(0,1);
            for(int j=1; j<row.size()-1; j++){
                row.set(j, row.get(j)+row.get(j+1));
            }
            allRows.add(new ArrayList<Integer>(row));
        }
        return allRows;
    }
}
