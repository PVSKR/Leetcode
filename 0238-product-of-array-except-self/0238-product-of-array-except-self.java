class Solution {
    public int[] productExceptSelf(int[] nums) {
        int leftProduct = 1;
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            ans[i] = leftProduct;
            leftProduct *= nums[i];
        }
        int rightProduct = 1;
        for(int i=nums.length-1; i>=0; i--) {
            ans[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        return ans;
    }
}