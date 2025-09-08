package com.Basic.LinkedList;
public class dublicate {
    public static void main(String[] args) {
        Lindelist first = new Lindelist();
        first.add(40);
        first.add(20);
        first.add(30);
        first.add(50);
        first.add(50);
        first.add(60);
        first.add(70);
        first.add(80);

//        System.out.println("Original List:");
//        first.printList();
//
        System.out.println("List after removing duplicates:");
        first.removeDublicate();


    }
}
