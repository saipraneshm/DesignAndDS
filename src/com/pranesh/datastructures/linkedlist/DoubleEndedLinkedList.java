package com.pranesh.datastructures.linkedlist;

/**
 * Created by sai pranesh on 5/23/2017.
 */
public class DoubleEndedLinkedList {

    private Node head;
    private Node last;

    DoubleEndedLinkedList(){
        head = null;
        last = null;
    }

    boolean isEmpty(){
        return head == null;
    }

    void addFirst(int key){
        Node newNode = new Node(key);
        if(isEmpty())
            last = newNode;
        newNode.next = head;
        head = newNode;
    }

    void addLast(int key){
        Node newNode = new Node(key);
        if(isEmpty())
            head = newNode;
        else
            last.next = newNode;
        last = newNode;
    }

    Node removeFirst(){
        if(head.next == null) //case only when there is one item in the list
            last = null;
        Node temp = head;
        head = head.next;
        return temp;
    }

    Node removeNode(int key){
        Node current = head;
        Node previous = head;
        while(current.data != key){
            if(current.next == null) return null;
            previous = current;
            current = current.next;
        }
        if( current == head){
            head = head.next;
        }else{
            previous.next = current.next;
        }
        return current;
    }

    Node find(int key){
        Node current = head;
        while( current.data != key){
            if(current.next == null) return null;
            current = current.next;
        }
        return current;
    }

    void displayAllNodes(){
        Node current = head;
        while(current != null){
            System.out.println(current);
            current = current.next;
        }
    }

}
