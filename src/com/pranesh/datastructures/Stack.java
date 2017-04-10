package com.pranesh.datastructures;

/**
 * Created by sai pranesh on 09-Apr-17.
 */
public class Stack {


    private int MAX_SIZE = 30;
    private int noOfElems;
    private int[] stack;

    Stack(){
        stack = new int[MAX_SIZE];
        noOfElems = -1;
    }

    public int peek(){
        //System.out.println(stack[noOfElems]);
        return stack[noOfElems];
    }

    public void push(int elem){
        stack[++noOfElems] = elem;
    }

    public int pop(){
        int poppedElem = stack[noOfElems];
        --noOfElems;
        return poppedElem;
    }

    public boolean isEmpty(){
        return (noOfElems == -1);
    }
}
