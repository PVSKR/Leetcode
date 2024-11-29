class Solution {

    private final int[][] directions = {{0,1}, {0,-1}, {1,0}, {-1,0}};
    public int orangesRotting(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int minutes = 0, freshCount = 0;
        
        Queue<int[]> q = new LinkedList<>();
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 2) q.add(new int[] {i, j});
                if(grid[i][j] == 1) freshCount++;
            }
        }

        while(!q.isEmpty() && freshCount>0){
            //boolean hasNewRotten = false;
            minutes++;
            int size = q.size();
            for(int i=0; i<size; i++){
                int[] current = q.poll();
                int row = current[0], col = current[1];

                for(int[] dir : directions) {
                    int newRow = row + dir[0];
                    int newCol = col + dir[1];

                    if(newRow>=0 && newCol >= 0 && newRow < m && newCol < n && grid[newRow][newCol] == 1){
                        grid[newRow][newCol] = 2;
                        freshCount--;
                        q.add(new int[] {newRow, newCol});
                    }
                }
            }
            //minutes++;
            
        }
        return freshCount == 0 ? minutes : -1;
    }
}