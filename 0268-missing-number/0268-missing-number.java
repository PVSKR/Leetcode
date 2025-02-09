class Solution {
    public int missingNumber(int[] nums) {
        //Arrays.sort(nums);
        int sum = 0;
        for(int i=0; i<nums.length; i++) {
            sum = sum + nums[i];
        }
        return (nums.length*(nums.length+1)/2) - sum;
    }
}