class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<numRows; i++) {
            int[] row = new int[i+1];
            row[0] = 1; row[row.length-1] = 1;
            for(int j=1; j<row.length-1; j++) {
                row[j] = ans.get(i-1).get(j-1) + ans.get(i-1).get(j);
            }
            
            List<Integer> rowList = new ArrayList<>();
            for(int num : row) {
                rowList.add(num);
            }
            ans.add(rowList);
        }
        return ans;
    }
}