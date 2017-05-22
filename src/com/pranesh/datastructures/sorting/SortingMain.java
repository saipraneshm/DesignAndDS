package com.pranesh.datastructures.sorting;

/**
 * Created by sai pranesh on 10-Apr-17.
 */
public class SortingMain {

    public static void main(String[] args){

        Sort sort = new Sort();
        sort.insert(45);
        sort.insert(39);
        sort.insert(14);
        sort.insert(92);
        sort.insert(81);
        sort.insert(23);
        sort.insert(15);
        sort.insert(20);
        sort.insert(105);
        sort.insert(35);

        sort.display();
        sort.insertionSort();
        System.out.println("");
        sort.display();

    }
}
