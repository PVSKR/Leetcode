class Solution {

    private final int[][] directions = {{0,1},{0,-1}, {1,0}, {-1,0}};

    public int minimumObstacles(int[][] grid) {
        int m = grid.length, n = grid[0].length;

        int[][] minObstacles = new int[m][n];

        for(int i = 0; i<m; i++){
            for(int j=0; j<n; j++){
                minObstacles[i][j] = Integer.MAX_VALUE;
            }
        }
        minObstacles[0][0] = grid[0][0];

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0]-b[0]);
        pq.add(new int[] {minObstacles[0][0], 0, 0});

        while(!pq.isEmpty()){
            int[] currentCell = pq.poll();
            int obstacles = currentCell[0], row = currentCell[1], col = currentCell[2];
            if(row == m-1 && col == n-1) return obstacles;

            for(int[] dir: directions){
            int newRow = row + dir[0];
            int newCol = col + dir[1];

            if(newRow>=0 && newCol>=0 && newRow<grid.length && newCol<grid[0].length){
                int newObstacles = obstacles + grid[newRow][newCol];

                if(newObstacles < minObstacles[newRow][newCol]){
                    minObstacles[newRow][newCol] = newObstacles;
                    pq.add(new int[] {newObstacles, newRow, newCol});
                }
            }
        }
        }

        return minObstacles[m-1][n-1];
    }
}