class Solution {
    public int longestConsecutive(int[] nums) {
       Set<Integer> set = new HashSet<>();
       
       for(int num : nums) {
        set.add(num);
       }
       int maxLength = 0;
        for(int num : set) {
            if(!set.contains(num - 1)) {
                int length = 1;
                while(set.contains(num+length)) length++;
                maxLength = Math.max(length, maxLength);
            }
        }
        return maxLength;
    }
}