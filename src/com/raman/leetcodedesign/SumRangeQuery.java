package com.raman.leetcodedesign;

public class SumRangeQuery {

    private final int[] prefix;

    public SumRangeQuery(int[] nums) {
        this.prefix = computePrefix(nums);
    }

    public int sumRange(int left, int right) {
        return prefix[right + 1] - prefix[left];
    }

    private int[] computePrefix(int[] nums) {
        int[] p = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            p[i + 1] = p[i] + nums[i];
        }
        return p;
    }
}
