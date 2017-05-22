package com.pranesh.datastructures.stacksandqueues;

/**
 * Created by sai pranesh on 16-Apr-17.
 */
public class PriorityQueue {

    private int maxSize;
    private int nItems;
    private int[] prq;

    public PriorityQueue(int size){
        maxSize = size;
        nItems = 0;
        prq = new int[maxSize];
    }

    public boolean isEmpty(){
        return nItems == 0;
    }

    public boolean isFull(){
        return nItems == maxSize;
    }

    public int delete(){
        if(isEmpty())
            throw new IndexOutOfBoundsException("Try inserting and " +
                    "then deleting, the queue is empty");
        int temp = prq[nItems - 1];
        nItems-- ;
        return temp;
    }

    public void insert(int element){
        if(isFull())
            throw new IndexOutOfBoundsException("Queue is full");
        int j ;
        if(nItems == 0){
            prq[nItems++] = element;
        }else{
            for( j = nItems-1; j >=0 ;j--){
                if(element > prq[j]){
                    prq[j+1] = prq[j];
                }else{
                    break;
                }
            }
            prq[j+1] = element;
            nItems++;
        }
    }
}
