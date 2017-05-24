package com.pranesh.datastructures.linkedlist;

/**
 * Created by sai pranesh on 5/23/2017.
 */
public class LinkedListsMain {

    public static void main(String[] args) {

       /* SimpleLinkedList simpleLinkedList = new SimpleLinkedList();

        simpleLinkedList.addFirst(34);
        simpleLinkedList.addFirst(92);
        simpleLinkedList.addFirst(10);
        simpleLinkedList.addFirst(46);
        simpleLinkedList.addFirst(56);
        simpleLinkedList.addFirst(89);

     //   simpleLinkedList.displayAllNodes();

        simpleLinkedList.removeFirst();
        simpleLinkedList.removeNode(10);

        simpleLinkedList.displayAllNodes();

        System.out.println(simpleLinkedList.size() + " <- size");
        System.out.println(simpleLinkedList.find(56));*/

        DoubleEndedLinkedList doubleEndedLinkedList = new DoubleEndedLinkedList();

        doubleEndedLinkedList.addFirst(34);
        doubleEndedLinkedList.addFirst(92);
        doubleEndedLinkedList.addFirst(10);
        doubleEndedLinkedList.addFirst(46);
        doubleEndedLinkedList.addFirst(56);
        doubleEndedLinkedList.addFirst(89);
        doubleEndedLinkedList.addLast(72);
        doubleEndedLinkedList.addLast(2);
        doubleEndedLinkedList.addLast(62);
        doubleEndedLinkedList.addLast(11);



        doubleEndedLinkedList.displayAllNodes();

        doubleEndedLinkedList.removeFirst();
        doubleEndedLinkedList.removeNode(10);

        System.out.println(" ");

        doubleEndedLinkedList.displayAllNodes();

        System.out.println("Found key ->" + doubleEndedLinkedList.find(56));

        SortedLinkedList sortedLinkedList = new SortedLinkedList();

        sortedLinkedList.add(49);
        sortedLinkedList.add(52);
        sortedLinkedList.add(12);
        sortedLinkedList.add(69);
        sortedLinkedList.add(67);
        sortedLinkedList.add(100);
        sortedLinkedList.add(1);

        sortedLinkedList.displayAllNodes();

        System.out.println(" Doubly linked lists implementation starts");

        DoublyLinkedLists doublyLists = new DoublyLinkedLists();

        System.out.println("-------- Inserted elements from first --------");

        doublyLists.insertFirst(45);
        doublyLists.insertFirst(54);
        doublyLists.insertFirst(21);
        doublyLists.insertFirst(35);

        doublyLists.displayFromBothEnds();

        System.out.println("\n -------- Inserted elements from last --------");

        doublyLists.insertLast(95);
        doublyLists.insertLast(124);
        doublyLists.insertLast(210);
        doublyLists.insertLast(352);

        doublyLists.displayFromBothEnds();

        System.out.println("-------- Deleting elements ---------");

        doublyLists.deleteFirst();
        doublyLists.deleteLast();

        doublyLists.displayFromBothEnds();

        doublyLists.insertAfter(54, 78);

        doublyLists.deleteKey(78);

        doublyLists.displayFromBothEnds();


    }

}
