package com.raman.lfucache;
import java.util.HashMap;
import java.util.Map;

class LFUCache {
    private final int capacity;
    private final Map<Integer, Node> keyToNode;
    private final Map<Integer, DoublyLinkedList> freqToList;
    private int minFreq;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.minFreq = 0;
        this.keyToNode = new HashMap<>();
        this.freqToList = new HashMap<>();
    }

    public int get(int key) {
        if (capacity <= 0 || !keyToNode.containsKey(key)) {
            return -1;
        }
        Node node = keyToNode.get(key);
        updateFrequency(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (this.capacity <= 0) {
            return;
        }

        if (keyToNode.containsKey(key)) {
            Node node = keyToNode.get(key);
            node.value = value;
            updateFrequency(node);
            return;
        }

        if (keyToNode.size() == this.capacity) {
            DoublyLinkedList minList = freqToList.get(this.minFreq);
            Node evicted = minList.removeTail();
            if (evicted != null) {
                keyToNode.remove(evicted.key);
            }
        }

        Node newNode = new Node(key, value);
        keyToNode.put(key, newNode);
        freqToList.computeIfAbsent(1, k -> new DoublyLinkedList()).addToHead(newNode);
        this.minFreq = 1;
    }

    private void updateFrequency(Node node) {
        int oldFreq = node.frequency;
        DoublyLinkedList oldList = freqToList.get(oldFreq);
        oldList.removeNode(node);

        if (oldFreq == this.minFreq && oldList.length == 0) {
            this.minFreq++;
        }

        node.frequency++;
        freqToList.computeIfAbsent(node.frequency, k -> new DoublyLinkedList()).addToHead(node);
    }
}

