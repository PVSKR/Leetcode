class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap<>();
        Integer[] newNums = new Integer[nums.length];
        for(int i=0; i<nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            newNums[i] = nums[i];
        }
        Arrays.sort(newNums, (n1, n2) -> {
    if (map.get(n1) != map.get(n2)) {
                // if freq of numbers are not equal then return in increasing order based on
                // freq.
        return map.get(n1) - map.get(n2);
    } else {
                // otherwise sort them in decreasing order based on number in nums.
        return n2 - n1;
    }
});
    for(int i=0; i<nums.length; i++) nums[i] = newNums[i];
    return nums;
    }
}