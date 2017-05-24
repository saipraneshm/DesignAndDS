package com.pranesh.datastructures.linkedlist;

/**
 * Created by sai pranesh on 5/23/2017.
 */
public class SortedLinkedList {

    Node head;

    SortedLinkedList(){ head = null;}

    private boolean isEmpty(){
        return head == null;
    }


    Node removeFirst(){
        Node temp = head;
        head = head.next;
        return temp;
    }

    void add(int key){
        Node newNode = new Node(key);
        Node current = head;
        Node previous = null;
        while( current != null && key < current.data){
            previous = current;
            current = current.next;
        }
        if(previous == null)
            head = newNode;
        else
            previous.next = newNode;
        newNode.next = current;
    }

    Node removeNode(int key){
        Node current = head;
        Node previous = head;
        while( current.data != key){
            if(current.next == null){
                return null;
            }else{
                previous = current;
                current = current.next;
            }
        }
        if( current == head){
            head = head.next;
        }else{
            previous.next = current.next;
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
