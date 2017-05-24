package com.pranesh.datastructures.linkedlist;

/**
 * Created by sai pranesh on 5/23/2017.
 */
public class Link {

    Link previous;
    Link next;
    int data;

    Link(int data){
        this.data = data;
        previous = null;
        next = null;
    }

    void displayLink(){
        System.out.println("Link value is -> " + data);
    }

    @Override
    public String toString() {
        return "Link value is -> " + data;
    }
}
