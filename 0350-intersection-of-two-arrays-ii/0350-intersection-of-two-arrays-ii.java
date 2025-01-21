class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) +1);
        }
        for(int num : nums2) {
            if(map.getOrDefault(num, 0) > 0) {
                list.add(num);
                map.put(num, map.get(num)-1);
            }
        }
        return list.stream().mapToInt(a->a).toArray();
    }
}