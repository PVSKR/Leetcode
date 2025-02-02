class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int l = 0, r =height.length-1;
        while(l<r) {
            int area = (r-l) * Math.min(height[l], height[r]);
            maxWater = Math.max(area, maxWater);
            if(height[l] < height[r]) l++;
            else r--;
        }
        return maxWater;
    }
}