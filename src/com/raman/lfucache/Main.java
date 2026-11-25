package com.raman.lfucache;

public class Main {
    public static void main(String[] args) {
        // Create an LFU Cache with capacity 2
        LFUCache cache = new LFUCache(2);

        System.out.println("put(1, 10)");
        cache.put(1, 10); // freq=1: [1:10], minFreq=1

        System.out.println("put(2, 20)");
        cache.put(2, 20); // freq=1: [2:20] -> [1:10] (1 is LRU at freq 1), minFreq=1

        System.out.println("get(1) -> " + cache.get(1)); // Returns 10; key 1 moves to freq=2. freq=1: [2:20], minFreq=1

        System.out.println("put(3, 30) [evicts key 2 (freq=1)]");
        cache.put(3, 30); // Capacity full; evicts minFreq=1 tail (key 2). freq=1: [3:30], freq=2: [1:10]

        System.out.println("get(2) -> " + cache.get(2)); // Returns -1 (evicted)
        System.out.println("get(3) -> " + cache.get(3)); // Returns 30; key 3 moves to freq=2. freq=2: [3:30] -> [1:10], minFreq=2

        System.out.println("put(4, 40) [both keys have freq=2; evicts LRU key 1]");
        cache.put(4, 40); // Tie at minFreq=2: key 1 was used earlier than key 3, so key 1 is evicted. freq=1: [4:40], minFreq=1

        System.out.println("get(1) -> " + cache.get(1)); // Returns -1 (evicted)
        System.out.println("get(3) -> " + cache.get(3)); // Returns 30
        System.out.println("get(4) -> " + cache.get(4)); // Returns 40
    }
}