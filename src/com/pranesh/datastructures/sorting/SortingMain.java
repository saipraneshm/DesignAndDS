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

      /*  sort.display();
        sort.insertionSort();
        System.out.println("");
        sort.display();*/

        int[] sampleIntArr = new int[]{ 10 , 20 , 45 , 2, 5 , 97, 3, 56 , 36, 89, 46, 124, 37, 679, 20, 13 , 67, 32, 62, 11, 76 };

        sort.quickSort(sampleIntArr);

        for(int x : sampleIntArr){
            System.out.print(" " + x);
        }

    }
}
