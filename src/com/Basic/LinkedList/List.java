package com.Basic.LinkedList;

import java.util.LinkedHashSet;
import java.util.LinkedList;

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

    void removeDublicate() {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        Node current = head.next; // skip dummy node

        while (current != null) {
            set.add(current.data);
            current = current.next;
        }

        // Now rebuild the list
        Node dummy = new Node(-1, null); // new dummy head
        Node tail = dummy;

        for (int value : set) {
            Node newNode = new Node(value, null);
            tail.next = newNode;
            tail = newNode;
        }

        // Reassign cleaned list to current head
        head.next = dummy.next;
    }
}


public class List {
    public static void main(String[] args) {
        Lindelist first = new Lindelist();
        first.add(6);
        first.add(10);
        first.add(10);
        first.add(50);
        first.add(60);
        first.add(10);

        System.out.println("Original list:");
        first.printList();

        System.out.println("After removing duplicates:");
        first.removeDublicate();
        first.printList();

    }
}
