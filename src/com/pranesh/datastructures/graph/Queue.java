package com.pranesh.datastructures.graph;

/**
 * Created by sai pranesh on 10-Apr-17.
 */
public class Queue {

    private int[] queue;
    private int front;
    private int rear;
    private int MAX_SIZE;


    Queue(){
        MAX_SIZE = 20;
        queue = new int[MAX_SIZE];
        front = 0;
        rear = -1;
    }

    public void insert(int elem){
        if(rear == MAX_SIZE - 1){
            rear = -1;
        }
        queue[++rear] = elem;
    }


    public int remove(){
        int temp = queue[front++];
        if(front == MAX_SIZE){
            front = 0;
        }
        return temp;
    }

    public boolean isEmpty(){
        return ( rear + 1 == front || front + MAX_SIZE - 1 == rear);
    }

}
