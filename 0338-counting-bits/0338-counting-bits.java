class Solution {
    public int[] countBits(int n) {
        int count = 0;
        int[] ans = new int[n+1];
        for(int i = 0; i<=n; i++) {
            ans[i] = ans[i >> 1] + (i & 1);
        }
        return ans;
    }
}