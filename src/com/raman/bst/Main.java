package com.raman.bst;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        System.out.println("root-->" + bst.root);
        bst.sortedArrayToBST(new int[]{2, 3, 4});
        bst.print();
        System.out.println(bst.contains(90));
        System.out.println(bst.contains(3));
    }
}
