package com.pranesh.datastructures.linkedlist;

import java.util.*;

/**
 * Created by sai pranesh on 5/23/2017.
 * Implementation of a single linked list
 */
public class SimpleLinkedList {

    private Node head;
    private int size;

    public SimpleLinkedList(){
        head = null;
        size = 0;
    }

    private boolean isEmpty(){
        return head == null;
    }

    public int size(){
        return size;
    }

    public Node getHead(){
        return head;
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
      //  System.out.println(" Head is now pointing to " + head);
        size++;
    }

    public Node removeFirst(){
        Node temp = head;
        head = head.next;
        size--;
        return temp;
    }

    public Node find(int key){
        Node current = head;
        while( current.data != key){
            if( current.next == null) return null; //not found
            current  = current.next;
        }
        return current;
    }

    public Node removeNode(int key){
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

    public void displayAllNodes(){
        Node current = head;
        while(current != null){
            System.out.print(" " + current);
            current = current.next;
        }
    }

    //Methods to solve questions related to CCIT
    public void removeDups(){
        Node current = head;
        Node previous = null;
        HashMap<Integer , Boolean> hashMap = new HashMap<>();
        while(current != null){

            if(hashMap.containsKey(current.data)){
                previous.next = current.next;
            }else{
                hashMap.put(current.data, true);
                previous = current;
            }
            current = current.next;
        }
    }

    public void removeDups2(){
        Node current = head;
        while( current!= null){
            Node runner = current;
            while(runner.next != null){

                if(runner.next.data == current.data){
                    runner.next = runner.next.next;
                }else{
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }

    public Node kthElementFromLast(int k){
        Node p1 = head;
        Node p2 = head;

        for( int i =0 ; i < k ; i++){
            if(p1.next == null) return null;
            p1 = p1.next;
        }

        while( p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }

    //My implementation -
    // Correct idea,just missed the optimal solution
    public void deleteMiddleNode(Node d){
        if(d == null || d.next == null){
            return;
        }
        Node current = d.next;
        Node previous = d;
        while(current != null){
            if(current.next == null){
                previous.next = null;
            }
            previous.data = current.data;
            previous = current;
            current = current.next;
        }
    }

    //CCIT implementation
    public boolean deleteMiddleNodeCCIT(Node d){
        if(d == null || d.next == null){
            return false;
        }
        Node dummy = d.next;
        d.data = dummy.data;
        d.next = d.next.next;
        return true;
    }

    public Node getNthNode(int n){
        Node current = head;
        for( int i = 0; i < n; i ++){
            current = current.next;
        }
        return current;
    }

    public Node partition(Node node , int k){
        Node head = node;
        Node tail = node;
        while(node != null){
            Node next = node.next;

            if(node.data < k){
                node.next = head;
                head = node;
            }else{
                tail.next = node;
                tail = node;
            }
            node = next;
        }
        tail.next = null;
        return head;
    }

    //HackerRank code
    public void displayFromNode(Node n){
        Node current = n;
        while( current != null){
            current.display();
            current = current.next;
        }
    }

    public Node insertNthNode(Node head, int data, int pos){

        Node newNode = new Node(data);
        if( head == null || pos == 0 ){
            newNode.next = head;
            head = newNode;
            return head;
        }
        Node current = head;
        for( int i = 0 ; i < pos - 1 ; i ++){
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;

        return head;
    }

    public Node deleteNthNode(Node head, int position){

        Node current = head;
        if(position == 0){
            head = head.next;
            return head;
        }


        for( int i = 0; i < position -1 ; i++){
            if(current.next == null){
                return null;
            }
            current = current.next;
        }
        current.next = current.next.next;
        return head;
    }

   public void reversePrint(Node head){
        Stack<Integer> stack = new Stack();
        if(head == null) return;
        Node current = head;
        while( current != null){
            stack.push(current.data);
            current = current.next;
        }

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }

    }

    public Node reverseNode(Node head){

       Node newHead = null;
        if(head == null) return null;
        Node current = head;
        while( current != null){
            Node newNode = new Node(current.data);
            newNode.next = newHead;
            newHead = newNode;
            current = current.next;
        }
        return newHead;
    }

    public int CompareLists(Node headA, Node headB){
        Node a = headA;
        Node b = headB;
        if(a== null || b == null){
            return 0;
        }
        while(a != null && b!= null){
            if(a.next == null && b.next == null){
                if( a.data == b.data)
                    return 1;
            }
            if(a.data == b.data){
                System.out.println("comparing a & b " + a + " - " + b);
                a = a.next;
                b = b.next;
            }else{
                return 0;
            }
        }
        return 0;
    }

    public Node mergeLists(Node headA, Node headB) {
       Node a = headA;
       Node b = headB;
       PriorityQueue<Integer> q = new PriorityQueue<>();

       Node temp = null;
       while(a != null ){
           q.add(a.data);
           a = a.next;
       }

       while( b != null){
           q.add(b.data);
           b= b.next;
       }

        Iterator<Integer> iterator =  q.iterator();

       return null;

    }


}
