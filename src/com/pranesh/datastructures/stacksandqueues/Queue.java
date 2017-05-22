package com.pranesh.datastructures.stacksandqueues;


/**
 * Created by sai pranesh on 16-Apr-17.
 */
public class Queue {

    private int maxSize;
    private int[] QueueX;
    private int nItemSize;
    private int front;
    private int rear;

    public Queue(int size){
        maxSize = size;
        front = 0;
        rear = -1;
        QueueX = new int[maxSize];
        nItemSize = 0;
    }

    public boolean isEmpty(){
        return (nItemSize == 0);
    }

    public boolean isFull(){
        return (nItemSize == maxSize);
    }

    public void insert(int element){
        if(isFull())
            throw new IndexOutOfBoundsException("Queue is full, cannot insert any more items");

        if(rear == (maxSize - 1)){
            rear = -1;
        }
        QueueX[++rear] = element;
        nItemSize++;
    }

    public int remove(){
        if(isEmpty())
            throw new IndexOutOfBoundsException("Queue is empty, try inserting and then deleting the items");
        int temp = QueueX[front++];
        if(front == maxSize){
            front = 0;
        }
        --nItemSize;
        return temp;
    }

    public int peek(){
        return QueueX[front];
    }

}
