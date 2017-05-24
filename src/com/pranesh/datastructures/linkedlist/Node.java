package com.pranesh.datastructures.linkedlist;

/**
 * Created by sai pranesh on 5/23/2017.
 */
public class Node {

    public int data;
    public Node next;

    Node(int data){
        next = null;
        this.data = data;
    }

    void display(){
        System.out.println(" Data is -> " + data);
    }

    @Override
    public String toString() {
        return Integer.valueOf(data).toString();
    }
}
