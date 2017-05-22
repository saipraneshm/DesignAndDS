package com.pranesh.datastructures.stacksandqueues;

/**
 * Created by sai pranesh on 16-Apr-17.
 */
public class Stack {

    private int maxSize;
    private int[] StackX;
    private int top;

    public Stack(int size){

        maxSize = size;
        StackX = new int[maxSize];
        top = -1;
    }

    public void push(int element){
        if(isFull())
            throw new IndexOutOfBoundsException("Stack is full, cannot perform push operation");

        StackX[++top] = element;
    }

    public int pop(){
        if(isEmpty())
            throw new IndexOutOfBoundsException("The stack is empty, cannot pop elements out of an empty stack");
        int temp = StackX[top--];
        return temp;
    }

    public int peek(){
        return StackX[top];
    }

    public boolean isEmpty(){
        return (top==-1);
    }

    public boolean isFull(){
        return (top == (maxSize-1));
    }


}
