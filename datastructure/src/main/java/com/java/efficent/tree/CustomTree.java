package com.java.efficent.tree;

public class CustomTree {
    Tree head;

    void add(int data) {
        head = add(head, data);
    }

    Tree add(Tree head, int data) {
        if (head == null) {
            return new Tree(data);
        }
        if (data < head.data) {
            head.left = add(head.left, data);
        } else if (data > head.data) {
            head.right = add(head.right, data);
        }
        return head;
    }

    void printBranches(Tree tree) {
        if (tree == null) {
            return;
        }

        System.out.printf("%d ", tree.data);
        if (tree.left != null) {
            printBranches(tree.left);
        }

        if (tree.right != null) {
            printBranches(tree.right);
        }

    }

    public static void main(String[] args) {
        CustomTree customTree = new CustomTree();
        customTree.add(5);
        customTree.add(3);
        customTree.add(4);
        customTree.add(1);
        customTree.add(8);

        customTree.printBranches(customTree.head);
    }
}

class Tree {
    int data;
    Tree left;
    Tree right;

    Tree(int data) {
        this.data = data;
    }
}
