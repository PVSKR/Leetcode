class Solution {
    public int maxProduct(int[] nums) {
        // int maxProduct = Integer.MIN_VALUE;
        // int prefixProd = 1, suffixProd = 1;
        // for(int i=0; i<nums.length; i++) {
        //     if(prefixProd==0) prefixProd = 1;
        //     if(suffixProd==0) suffixProd = 1;
        //     prefixProd *= nums[i];
        //     suffixProd *= nums[nums.length-i-1];
        //     maxProduct = Math.max(maxProduct, Math.max(prefixProd, suffixProd));
        // }
        // return maxProduct;
        int maxProduct = nums[0], prod1 = nums[0], prod2 = nums[0];
        for(int i=1; i<nums.length; i++) {
            int temp = Math.max(nums[i], Math.max(prod1*nums[i], prod2*nums[i]));
            prod2 = Math.min(nums[i], Math.min(prod1*nums[i], prod2*nums[i]));
            prod1 = temp;
            maxProduct = Math.max(maxProduct, prod1);
        }
        return maxProduct;
    }
}