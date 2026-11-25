package com.raman.lrucache;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    private final int capacity;
    private final Map<Integer, Node> cache;
    private final DoublyLinkedList lruList;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.lruList = new DoublyLinkedList();
    }

    public int get(int key) {
        Node node = cache.get(key);
        if (node == null) {
            return -1;
        }
        lruList.makeHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (capacity <= 0) {
            return;
        }

        Node existing = cache.get(key);
        if (existing != null) {
            existing.value = value;
            lruList.makeHead(existing);
            return;
        }

        if (lruList.length == capacity) {
            Node evicted = lruList.removeTail();
            if (evicted != null) {
                cache.remove(evicted.key);
            }
        }

        Node newNode = new Node(key, value);
        lruList.addToHead(newNode);
        cache.put(key, newNode);
    }
}
