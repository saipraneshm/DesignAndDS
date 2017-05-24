package com.pranesh.datastructures.linkedlist;

/**
 * Created by sai pranesh on 5/23/2017.
 * Implementation of a single linked list
 */
public class SimpleLinkedList {

    private Node head;
    private int size;

    SimpleLinkedList(){
        head = null;
        size = 0;
    }

    private boolean isEmpty(){
        return head == null;
    }

    public int size(){
        return size;
    }

    void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
      //  System.out.println(" Head is now pointing to " + head);
        size++;
    }

    Node removeFirst(){
        Node temp = head;
        head = head.next;
        size--;
        return temp;
    }

    Node find(int key){
        Node current = head;
        while( current.data != key){
            if( current.next == null) return null; //not found
            current  = current.next;
        }
        return current;
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
        size--;
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
