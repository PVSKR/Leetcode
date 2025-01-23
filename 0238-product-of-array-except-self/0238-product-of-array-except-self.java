class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int[] ans = new int[nums.length];
        // int leftProd = 1;
        // for(int i=0; i<nums.length; i++) {
        //     ans[i] = leftProd;
        //     leftProd *= nums[i];
        // }
        // int rightProd = 1;
        // for(int i=nums.length-1; i>=0; i--) {
        //     ans[i] *= rightProd;
        //     rightProd *= nums[i];
        // }
        // return ans;

        int prod=1, zeros=0;
        for(int num : nums) {
            if(num != 0) prod *= num;
            else zeros++;
        }
        if(zeros > 1) return new int[nums.length];

        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            if(zeros > 0) ans[i] = (nums[i] == 0) ? prod : 0;
            else ans[i] = prod/nums[i]; 
        }
        return ans;
    }
}