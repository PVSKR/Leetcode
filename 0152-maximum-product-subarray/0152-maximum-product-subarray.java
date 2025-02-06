class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = Integer.MIN_VALUE;
        int prefixProd = 1, suffixProd = 1;
        for(int i=0; i<nums.length; i++) {
            if(prefixProd==0) prefixProd = 1;
            if(suffixProd==0) suffixProd = 1;
            prefixProd *= nums[i];
            suffixProd *= nums[nums.length-i-1];
            maxProduct = Math.max(maxProduct, Math.max(prefixProd, suffixProd));
        }
        return maxProduct;
    }
}