class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        if(nums.length == 1) return new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<nums.length; i++) {
            int x = Math.abs(nums[i]);
            if(nums[x-1] < 0) ans.add(x);
            nums[x-1] *= -1;
        }
        return ans;

        // Set<Integer> set = new HashSet<>();
        // List<Integer> ans = new ArrayList<>();
        // for(int i=0; i<nums.length; i++) {
        //     if(!set.add(nums[i])) ans.add(nums[i]);
        // }
        // return ans;
    }
}