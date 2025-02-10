class Solution {
    public int findKthLargest(int[] nums, int k) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // for(int num : nums) {
        //     pq.offer(num);
        //     if(pq.size() > k) {
        //         pq.poll();
        //     }
        // }
        // return pq.peek();
        List<Integer> list = new ArrayList<>();
        for(int num : nums) list.add(num);
        return quickSelect(list, k);
    }

    private int quickSelect(List<Integer> list, int k) {
        int pivotIndex = new Random().nextInt(list.size());
        int pivot = list.get(pivotIndex);
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        List<Integer> mid = new ArrayList<>();

        for(int num : list) {
            if(num > pivot) left.add(num);
            else if(num < pivot) right.add(num);
            else mid.add(num);
        }

        if(left.size() >= k) return quickSelect(left, k);
        else if(left.size() + mid.size() < k) return quickSelect(right, k-left.size()-mid.size());
        return pivot;

    }
}