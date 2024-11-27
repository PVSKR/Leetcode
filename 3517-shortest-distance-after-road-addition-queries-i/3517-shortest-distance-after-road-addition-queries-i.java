class Solution {
    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        List<Integer> answer = new ArrayList<>();
        List<List<Integer>> adjList = new ArrayList<>();

        for(int i=0; i<n; i++) adjList.add(new ArrayList<>());

        for(int i=0; i<n-1; i++) adjList.get(i).add(i+1);

        for(int[] road : queries) {
            int u = road[0];
            int v = road[1];
            adjList.get(u).add(v);
            answer.add(bfs(n, adjList));
        }

        return answer.stream().mapToInt(i->i).toArray();

    }

    private int bfs(int n, List<List<Integer>> adjList) {
        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        visited[0] = true;

        int currentLevelCount = 1;
        int nextLevelCount = 0;
        int levels = 0;

        while(!q.isEmpty()) {
            for(int i=0; i< currentLevelCount; i++) {
                int currentNode = q.poll();
                if(currentNode == n-1) return levels;
        
                for(int neighbor : adjList.get(currentNode)) {
                    if(visited[neighbor]) continue;
                    q.add(neighbor);
                    nextLevelCount++;
                    visited[neighbor] = true;
                }
            }

            currentLevelCount = nextLevelCount;
            nextLevelCount = 0;
            levels++;
        }
        return -1;
    }
}