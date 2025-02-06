class Solution {
    public int findMin(int[] nums) {
        int left=0, right=nums.length-1;
        int minElement = Integer.MAX_VALUE;
        while(left <= right) {
            int mid = left + (right-left)/2;
            if(nums[left] <= nums[right]) {
                minElement = Math.min(minElement, nums[left]);
                break;
            }
            else if(nums[left] <= nums[mid]) {
                minElement = Math.min(minElement, nums[left]);
                left=mid+1;
            }
            else {
                minElement = Math.min(minElement, nums[mid]);
                right=mid-1;
            }
        }
        return minElement;
    }
}