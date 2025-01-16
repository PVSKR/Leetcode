class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        int unique = 1;
        int i=0, j= i;
        while (i< nums.length && j<nums.length) {
            if(nums[i]==nums[j]) j++;
            if(j>=nums.length) break;
            if(nums[i] != nums[j]) {
                nums[i+1] = nums[j];
                i++;
            }
        }
    return i+1;
    }
}