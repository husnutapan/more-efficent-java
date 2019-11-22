package com.java.solution;


public class MergeTwoNodes {

    Node head;

    void add(int data) {
        head = add(head, data);
    }

    Node add(Node head, int data) {
        if (head == null) {
            return new Node(data);
        }
        if (data < head.data) {
            head.left = add(head.left, data);
        } else if (data > head.data) {
            head.right = add(head.right, data);
        }
        return head;
    }


    static Node mergeTrees(Node node1, Node node2) {
        if (node1 == null) return node2;
        if (node2 == null) return node1;
        node1.data += node2.data;
        node1.left = mergeTrees(node1.left, node2.right);
        node1.right = mergeTrees(node1.right, node2.right);
        return node1;
    }

    public static void main(String[] args) {
        MergeTwoNodes mergeTwoNodes = new MergeTwoNodes();
    }
}

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}