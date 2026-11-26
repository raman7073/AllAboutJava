package com.raman.leetcodedesign;

import java.util.ArrayDeque;
import java.util.Deque;

class RecentCounter {

    private final Deque<Integer> dq;

    public RecentCounter() {
        this.dq = new ArrayDeque<>();
    }

    public int ping(int t) {
        dq.offerLast(t);
        while (!dq.isEmpty() && t - dq.peekFirst() > 3000) {
            dq.pollFirst();
        }
        return dq.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
