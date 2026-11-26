package com.raman.leetcodedesign;

import java.util.ArrayList;
import java.util.List;

class OrderedStream {
    private final String[] values;
    private int ptr;

    public OrderedStream(int n) {
        this.values = new String[n + 1];
        this.ptr = 1;
    }

    public List<String> insert(int idKey, String value) {
        this.values[idKey] = value;
        List<String> chunk = new ArrayList<>();
        while (ptr < values.length && values[ptr] != null) {
            chunk.add(values[ptr]);
            ptr++;
        }
        return chunk;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */