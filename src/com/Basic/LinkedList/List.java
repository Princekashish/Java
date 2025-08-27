package com.Basic.LinkedList;

class Node {
    int data;
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

class Lindelist {
    Node head;
    int size;

    Lindelist() {
        Node newNode = new Node(-1, null);
        head = newNode;
        size = 0;
    }

    void add(int val) {
        Node newNode = new Node(val, head.next);
        head.next = newNode;
        size++;
    }

    void printList() {
        Node current = head.next; // skip dummy
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}


public class List {
    public static void main(String[] args) {
        Lindelist first = new Lindelist();
        first.add(6);
        first.add(10);

        first.printList();

    }
}
