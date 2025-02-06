class Solution {
    public int maxProfit(int[] prices) {
        // int maxProfit = 0;
        // int minPrice = prices[0];
        // for(int i=0; i<prices.length; i++) {
        //     minPrice = Math.min(minPrice, prices[i]);
        //     maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        // }
        // return maxProfit;
        int left=0, right=0, maxProfit=0;
        while(right<prices.length) {
            if(prices[left]<prices[right]) maxProfit = Math.max(maxProfit, prices[right]-prices[left]);
            else left = right;
            right++;
        }
        return maxProfit;
    }
}