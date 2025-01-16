class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> m = new HashMap<>();
        List<Integer> bucket[] = new List[nums.length+1];
        for(int i=0; i< nums.length; i++) {
            m.put(nums[i], m.getOrDefault(nums[i], 0)+1);
        }
        for(int key: m.keySet()){
            int count = m.getKey();
            if(bucket[count] == null) bucket[count] = new ArrayList<>();
            bucket[count].add(key);
        }

        int[] ans = new int[nums.length];
        int index = 0;
        for(int i= nums.length; i>0; i--) {
            for(int val : bucket[i]){
                if(bucket[i] != null) {
                    ans[index] = val;
                    index++;
                    if(index==k) return ans;
                }
            }            
        }
    return ans;
    }
}