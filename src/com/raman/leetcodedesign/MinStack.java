package com.raman.leetcodedesign;

import java.util.ArrayDeque;
import java.util.Deque;

class MinStack {
    private final Deque<Integer> st;
    private final Deque<Integer> mn;

    public MinStack() {
        st = new ArrayDeque<>();
        mn = new ArrayDeque<>();
    }

    public void push(int value) {
        st.push(value);
        if (mn.isEmpty() || value <= mn.peek()) {
            mn.push(value);
        }
    }

    public void pop() {
        int x = st.pop();
        if (!mn.isEmpty() && x == mn.peek()) {
            mn.pop();
        }
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return mn.peek();
    }
}
