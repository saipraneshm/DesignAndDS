package com.pranesh.datastructures.tree;

import java.util.Arrays;

/**
 * Created by sai pranesh on 6/7/2017.
 */
public class MinHeap {
    int capacity = 10;
    int size = 0;

    int[] items = new int[capacity];

    void ensureCapacity(){
        if(size == capacity){
            items = Arrays.copyOf(items, capacity * 2);
            capacity *= 2;
        }
    }

    void swap(int firstIndex, int secondIndex){
        int temp = items[firstIndex];
        items[secondIndex] = items[firstIndex];
        items[firstIndex] = temp;
    }

    private int getLeftChildIndex(int parentIndex){ return parentIndex * 2 + 1 ;}
    private int getRightChildIndex(int parentIndex) { return parentIndex * 2 + 2 ;}
    private int getParentIndex(int childIndex) { return (childIndex - 1) / 2 ; }

    private boolean hasLeftChild(int parentIndex) { return getLeftChildIndex(parentIndex) < size ;}
    private boolean hasRightChild(int parentIndex) { return getRightChildIndex(parentIndex) < size;}
    private boolean hasParent(int childIndex) { return getParentIndex(childIndex) >= 0 ;}

    private int leftChild(int parentIndex) { return items[getLeftChildIndex(parentIndex)]; }
    private int rightChild(int parentIndex) { return items[getRightChildIndex(parentIndex)]; }
    private int parent(int childIndex) { return items[getParentIndex(childIndex)]; }

    private int peek(){
        if( size == 0 ) throw new IllegalStateException();
        return items[0];
    }

    private int poll(){
        if(size == 0) throw new IllegalStateException();
        int item = items[0];
        items[0] = items[size - 1];
        size--;
        heapifyDown();
        return item;
    }

    private void insert(int item){
        ensureCapacity();
        items[size] = item;
        size++;
        heapifyUp();
    }

    private void heapifyUp(){
        int index = size - 1;
        while(hasParent(index) && parent(index) > items[index]){
            swap(getParentIndex(index), index);
            index = getParentIndex(index);
        }
    }

    private void heapifyDown(){
        int index = 0;
        while(hasLeftChild(index)){
            int smallerIntIndex = getLeftChildIndex(index);
            if(hasRightChild(index) && rightChild(index) < leftChild(index)){
                smallerIntIndex = getRightChildIndex(index);
            }

            if(items[index] < items[smallerIntIndex]){
                break;
            }else{
                swap( index , smallerIntIndex);
            }

            index = smallerIntIndex;

        }
    }

}
