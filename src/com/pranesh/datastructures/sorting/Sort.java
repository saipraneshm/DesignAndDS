package com.pranesh.datastructures.sorting;

/**
 * Created by sai pranesh on 10-Apr-17.
 */
public class Sort {

    private long[] a;
    private int nElems;

    Sort(){
        a = new long[20];
        nElems = 0;
    }

    public void insert(long value){
        a[nElems++] = value;
    }

    public void display(){
        for(int j =0 ;j < nElems ; j ++){
            System.out.print(a[j] + " ");
        }
    }

    public void swap(int one , int two){
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

    //sorting algorithms
    public void bubbleSort(){
        int out, in;
        for(out = nElems - 1 ; out > 0 ; out--){
            for( in = 0 ; in < out ; in++){
                if(a[in] > a[in+1]){
                    swap(in,in+1);
                }
            }
        }
    }

    public void selectionSort(){
        int out, in , min;
        for(out = 0 ; out < nElems - 1; out++){
            min = out;
            for(in = out + 1 ; in < nElems; in ++){
                if(a[min] > a[in]){
                    min = in;
                }
            }
            swap(min,out);
        }
    }

    public void insertionSort(){
        int out,  in;
        long temp;
        for(out = 1 ; out < nElems ; out++ ){
            temp = a[out];
            in = out;
            while( in > 0 && a[in-1] > temp){
                a[in] = a[in-1];
                --in;
            }
            a[in] = temp;
        }

    }

}
