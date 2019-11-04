package com.java.efficent.linkedlist;

public class LinkedlistFunctionality {
    public static void main(String[] args) {
        Functions functions = new Functions();
        functions.addToLast(new Node(1));
        functions.addToLast(new Node(3));
        functions.addToLast(new Node(2));
        functions.addToLast(new Node(5));
        functions.addToLast(new Node(4));

        functions.printAll();

    }
}

class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
    }
}

class Functions implements SinglyLinkedList {
    Node head;

    @Override
    public void addToLast(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    @Override
    public Node deleteFirst() {
        Node temp = head;
        head = head.next;
        return temp;
    }

    @Override
    public void deleteAfter(Node after) {
        Node temp = head;
        while (temp.next != null && temp.value != after.value) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    @Override
    public void deleteLast() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }


    @Override
    public void insertFirst(int first) {
        Node newNode = new Node(first);
        newNode.next = head;
        head = newNode;
    }

    @Override
    public void printAll() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("Written all element of head.");
    }
}


interface SinglyLinkedList extends BaseFunctions {
    void addToLast(Node node);

    Node deleteFirst();

    void deleteAfter(Node after);

    void deleteLast();

    void insertFirst(int first);
}

interface BaseFunctions {
    void printAll();
}

