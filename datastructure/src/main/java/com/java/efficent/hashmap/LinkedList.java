package com.java.efficent.hashmap;

public class LinkedList {
    private Node head = null;
    private int size = 0;

    void put(int data) {
        Node node = new Node(data);
        if (head == null) head = new Node(data);
        else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = node;
        }
        size++;
    }

    void remove(int data) {
        if (size == 0)
            return;
        else {
            Node temp = head;
            if (temp.data == data)
                head = temp.next;
            while (temp.next != null) {
                if (temp.next.data == data) {
                    temp.next = temp.next.next;
                    return;
                }
                temp = temp.next;
            }

        }
    }

    void print() {
        Node display = head;
        while (display != null) {
            System.out.println("data:" + display.data);
            display = display.next;
        }
    }
}
