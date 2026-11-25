package com.raman.lrucache;

public class DoublyLinkedList {
    Node head;
    Node tail;
    int length;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public void makeHead(Node node) {
        if (node == null || node == this.head) {
            return;
        }
        removeNode(node);
        addToHead(node);
    }

    public void addToHead(Node node) {
        node.prev = null;
        node.next = this.head;

        if (this.head != null) {
            this.head.prev = node;
        }
        this.head = node;

        if (this.tail == null) {
            this.tail = node;
        }
        this.length++;
    }

    public void removeNode(Node node) {
        if (node == null) {
            return;
        }

        if (node.prev != null) {
            node.prev.next = node.next;
        } else {
            this.head = node.next;
        }

        if (node.next != null) {
            node.next.prev = node.prev;
        } else {
            this.tail = node.prev;
        }

        node.prev = null;
        node.next = null;
        this.length--;
    }

    public Node removeTail() {
        if (this.tail == null) {
            return null;
        }
        Node removed = this.tail;
        removeNode(removed);
        return removed;
    }
}
