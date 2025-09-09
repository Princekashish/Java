package com.Basic.LinkedList;

import java.util.*;
class Node{
    int data;
    Node next;
    Node (int data,Node next){
        this.data=data;
        this.next = next;
    }
}

class LinkedList{
    Node head;

    LinkedList(){
        head=null;
    }

    void add(int data){
        Node newNode = new Node(data,head);
        head = newNode;
    }

    void printlist(){
        Node current = head;
        while(current !=null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }


}

class Main {

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static int reverse(Node head){
        int count = 0;
        Node current = head;
        while(current !=null){
            count++;
            current = current.next;
        }
        return count;

    }

    public static Node removeDuplicate(Node head){
        Set<Integer> list = new LinkedHashSet<>();
        Node current = head;
        while(current != null){
            list.add(current.data);
            current=current.next;
        }

        Node newHead = new Node(-1,null);
        Node tail= newHead;
        for(int value:list){
            Node newNode=new Node(value,null);
            tail.next=newNode;
            tail=newNode;
        }
        return newHead.next;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(9);
        list.add(10);
        list.add(13);
        list.add(10);
        list.add(12);

        System.out.print("Original list: ");
        list.printlist();

        Node newHead = removeDuplicate(list.head);

        System.out.print("List after removing duplicates: ");
        printList(newHead);
    }
}
