package problem_201_300.problem_215;

import java.util.PriorityQueue;

public class Solution1 {
    public int findKthLargest(int[] nums, int k) {
        int res;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);

        for (int i=0; i<nums.length; i++) {
            if (minHeap.size() < k) {
                minHeap.add(nums[i]);
            } else {
                if (minHeap.peek() < nums[i]) {
                    minHeap.poll();
                    minHeap.add(nums[i]);
                }
            }
        }
        res = minHeap.peek();

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        Solution1 solu = new Solution1();
        System.out.println(solu.findKthLargest(nums, k));
    }
}
