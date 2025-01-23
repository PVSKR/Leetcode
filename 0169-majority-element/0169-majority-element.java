class Solution {
    public int majorityElement(int[] nums) {
        // Arrays.sort(nums);
        // return nums[nums.length/2];

        int count = 0, element = 0;
        for(int i=0; i<nums.length; i++) {
            if(count==0) {
                count = 1;
                element = nums[i];
            }
            else if(element == nums[i]) count++;
            else count--;
        }
        int count1 = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == element) count1++;
        }
        if(count1 > nums.length/2) return element;
        return -1;
    }
}