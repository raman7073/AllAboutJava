package com.raman.lrucache;

public class Main {
    public static void main(String[] args) {
        // Create an LRU Cache with capacity 2
        LRUCache cache = new LRUCache(2);

        System.out.println("put(1, 100)");
        cache.put(1, 100); // Cache: [1:100]

        System.out.println("put(2, 200)");
        cache.put(2, 200); // Cache: [2:200] -> [1:100]

        System.out.println("get(1) -> " + cache.get(1)); // Returns 100; key 1 becomes most recently used: [1:100] -> [2:200]

        System.out.println("put(3, 300) [evicts key 2]");
        cache.put(3, 300); // Cache full; evicts LRU key 2: [3:300] -> [1:100]

        System.out.println("get(2) -> " + cache.get(2)); // Returns -1 (evicted)

        System.out.println("put(1, 150) [updates key 1]");
        cache.put(1, 150); // Updates key 1 and moves it to front: [1:150] -> [3:300]

        System.out.println("get(1) -> " + cache.get(1)); // Returns 150
        System.out.println("get(3) -> " + cache.get(3)); // Returns 300
    }
}