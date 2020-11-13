package com.company.ds;

public class BST {
    Node root;

    public Node search(Node root, Integer key) {

        if (root == null || root.key == key) {
            return root;
        }

        // the key is greater than root's key
        if (root.key < key) {
            return search(root.right, key);
        }

        // the key is lesser than root's key
        return search(root.left, key);
    }

    public void insert(Integer key) {

        this.root = insertRecursive(this.root, key);
    }

    private Node insertRecursive(Node root, Integer key) {

        if (root == null) {
           return new Node(key);
        }

        if (key < root.key) {
            root.left = insertRecursive(root.left, key);
        } else if (key > root.key) {
            root.right = insertRecursive(root.right, key);
        }

        return root;
    }
    
    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);
         
        System.out.println(bst.search(bst.root, 30));
    }
}


class Node {
    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                '}';
    }

    Integer key;
    Node left, right;

    public Node (Integer key) {
        this.key = key;
        left = right = null;
    }
}

