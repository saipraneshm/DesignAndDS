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

    public void mergeSort(int[] array){
        mergeSort(array, new int[array.length], 0 , array.length - 1);
    }

    private void mergeSort(int[] array, int[] temp, int leftStart, int rightEnd){
        if( leftStart >= rightEnd) return;

        int middle = (leftStart + rightEnd) / 2;
        mergeSort(array, temp, leftStart , middle);//sorting the left half of the array.
        mergeSort(array, temp, middle + 1, rightEnd); //sorting the right half of the array
        mergeHalves(array, temp , leftStart, rightEnd);//merging the two halves after both the halves are sorted and
                                                        // then creating the sorted array
    }

    private void mergeHalves(int[] array, int[] temp, int leftStart, int rightEnd){
        int leftEnd = ( rightEnd + leftStart) / 2;
        int rightStart = leftEnd + 1;

        int size = rightEnd - leftStart + 1;

        int right = rightStart;
        int left = leftStart;
        int index = leftStart;//index is for the temp array

        while( left <= leftEnd && right <= rightEnd){
            if( array[left] <= array[right]){
                temp[index] = array[left];
                left++;
            } else{
                temp[index] = array[right];
                right++;
            }
            index++;
        }

        System.arraycopy(array, left, temp, index , leftEnd - left + 1);
        System.arraycopy(array, right, temp, index, rightEnd - right + 1);
        System.arraycopy(temp, leftStart, array, leftStart, size);
    }

    public void quickSort(int[] array){
        quickSort(array, 0 ,array.length - 1);
    }

    private void quickSort(int[] array, int left, int right){
        if( left >= right ) return;

        int pivot = array[ (left + right) /2];
        int index = partition(array , pivot, left , right);
        quickSort(array, left, index- 1);
        quickSort(array, index, right);
    }

    private int partition(int[] array,int pivot , int left , int right){

        while( left <= right){
            while( array[left] < pivot){
                left++;
            }

            while( array[right] > pivot){
                right--;
            }

            //we are already checking the value of pivot vs array element, and hence swapping directly only if the
            //indexes are in the right order.
            if(left <= right){
                swap(left, right, array);
                left++;
                right--;
            }

        }
        return left;
    }

    private void swap(int a, int b, int[] array){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }


}
