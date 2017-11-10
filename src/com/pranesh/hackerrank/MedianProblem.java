package com.pranesh.hackerrank;


import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by saip92 on 7/3/2017.
 */
public class MedianProblem {

    public static double[] median(int[] array){
        PriorityQueue<Integer> lowers =  new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -1 * o1.compareTo(o2);
            }
        });
        PriorityQueue<Integer> highers = new PriorityQueue<>();
        double[] medians = new double[array.length];
        for(int i = 0; i < array.length; i++){
            int number = array[i];
            add(number, lowers, highers);
            rebalance(lowers, highers);
            medians[i] = medians(lowers, highers);
        }
        return medians;
    }

    private static void add( Integer number, PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers){
        if(lowers.size() == 0 || number < lowers.peek()){
            lowers.add(number);
        }else{
            highers.add(number);
        }
    }

    private static void rebalance(PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers){
        PriorityQueue<Integer> smallerHeap = lowers.size() > highers.size() ? highers : lowers;
        PriorityQueue<Integer> biggerHeap = lowers.size() > highers.size() ? lowers : highers;

        if((biggerHeap.size() - smallerHeap.size()) >= 2 ){
            smallerHeap.add(biggerHeap.poll());
        }

    }

    private static double medians(PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers){
        PriorityQueue<Integer> smallerHeap = lowers.size() > highers.size() ? highers : lowers;
        PriorityQueue<Integer> biggerHeap = lowers.size() > highers.size() ? lowers : highers;

        if(smallerHeap.size() == biggerHeap.size()){
            return ((double)( biggerHeap.peek() + smallerHeap.peek()) / 2 );
        }else{
            return biggerHeap.peek();
        }
    }



    public static void main(String[] args) {

        int[] sampleArray = new int[]{1, 2, 3 ,4 ,5, 6};

        for(double ans : median(sampleArray)){
            System.out.println(ans);
        }

    }

}
