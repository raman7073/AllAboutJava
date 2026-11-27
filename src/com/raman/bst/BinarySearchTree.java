package com.raman.bst;

public class BinarySearchTree {
    Node root;

    void insert(int val) {
        Node newNode = new Node(val);
        if (root == null) {
            root = newNode;
            return;
        }
        Node it = root;
        while (it != null) {
            if (val == it.value) {
                return; // Reject duplicates
            } else if (val > it.value) {
                if (it.right == null) {
                    it.right = newNode;
                    return;
                }
                it = it.right;

            } else {
                if (it.left == null) {
                    it.left = newNode;
                    return;
                }
                it = it.left;

            }
        }
    }

    public boolean contains(int val) {
        Node it = root;
        while (it != null) {
            if (val == it.value) {
                return true;
            } else if (val > it.value) {
                it = it.right;
            } else {
                it = it.left;
            }
        }
        return false;
    }

    public void print() {
        printInOrder(root);
        System.out.println(); // newline at the end
    }

    private void printInOrder(Node node) {
        if (node == null) {
            return;
        }
        printInOrder(node.left);
        System.out.print(node.value + " ");
        printInOrder(node.right);
    }

    public void sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        this.root = build(nums, 0, nums.length - 1);
    }

    public Node build(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = left + (right - left) / 2;
        Node node = new Node(nums[mid]);
        node.left = this.build(nums, left, mid - 1);
        node.right = this.build(nums, mid + 1, right);
        return node;
    }
}
