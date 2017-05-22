package com.pranesh.datastructures.stacksandqueues;

/**
 * Created by sai pranesh on 16-Apr-17.
 */
public class StackAndQueueMain {
    public static void main(String args[]){
       /* Stack test = new Stack(10);

        test.push(30);
        test.push(25);
        test.push(65);
        test.push(95);
        test.push(15);
        test.push(20);
        test.push(20);
        test.push(20);
        test.push(20);
        test.push(20);
        System.out.println(test.isFull() + " is full value");

        while(!test.isEmpty()){
            System.out.println(test.peek() + " peek");
            System.out.println(test.pop() + " popped");
        }*/

       /* Queue queue = new Queue(10);

        queue.insert(30);
        queue.insert(25);
        queue.insert(65);
        queue.insert(95);
        queue.insert(15);
        queue.insert(20);
        queue.insert(20);
        queue.insert(20);
        queue.insert(20);
        queue.insert(20);
        System.out.println(queue.isFull() + " is full value");

        while(!queue.isEmpty()){
           // System.out.println(test.peek() + " peek");
            System.out.println(queue.remove() + " popped");
        }
        */

        PriorityQueue priorityQueue = new PriorityQueue(10);

        priorityQueue.insert(30);
        priorityQueue.insert(25);
        priorityQueue.insert(65);
        priorityQueue.insert(95);
        priorityQueue.insert(15);
        priorityQueue.insert(90);
        priorityQueue.insert(106);
        priorityQueue.insert(35);
        priorityQueue.insert(87);
        priorityQueue.insert(12);

        while(!priorityQueue.isEmpty()){
            // System.out.println(test.peek() + " peek");
            System.out.println(priorityQueue.delete() + " deleted");
        }

    }
}
