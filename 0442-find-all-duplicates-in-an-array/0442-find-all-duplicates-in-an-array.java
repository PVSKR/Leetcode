class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        // if(nums.length == 1) return new ArrayList<>();
        // List<Integer> ans = new ArrayList<>();
        // for(int i=0; i<nums.length; i++) {
        //     int x = Math.abs(nums[i]);
        //     if(nums[x-1] < 0) ans.add(x);
        //     nums[x-1] *= -1;
        // }
        // return ans;

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])>1) ans.add(nums[i]);
        }
        return ans;
    }
}