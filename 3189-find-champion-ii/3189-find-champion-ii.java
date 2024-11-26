class Solution {
    public int findChampion(int n, int[][] edges) {
        int[] incoming = new int[n];
        int champion = -1, count = 0;
        for(int[] edge: edges){
            incoming[edge[1]]++;
        }

        for(int i=0; i<n; i++){
            if(incoming[i]==0){
                count++;
                champion = i;
            }
        }

        return count>1 ? -1 : champion;
    }
}