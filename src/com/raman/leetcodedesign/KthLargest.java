package com.raman.leetcodedesign;

import java.util.PriorityQueue;

class KthLargest {

    private final int k;
    private PriorityQueue<Integer> minHeap;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        minHeap = new PriorityQueue<>();
        for (int x : nums) {
            this.add(x);
        }
    }

    public int add(int val) {
        minHeap.offer(val);
        if (minHeap.size() > k) {
            minHeap.poll(); // drop the smallest of the (k + 1) largest elements
        }
        return minHeap.peek(); // smallest of the top k == kth largestl̥
    }
}

