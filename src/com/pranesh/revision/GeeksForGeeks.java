package com.pranesh.revision;

/**
 * Created by saip92 on 7/30/2017.
 */
public class GeeksForGeeks {

    static void sort(int[] arr, int low, int high){
        if( low < high){
            int pi = partition(arr, low, high);

            sort(arr, low, pi-1);
            sort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for(int j= low; j < high; j++){
            if(arr[j] < pivot){
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    public static void main(String[] args) {
        int[] arrayToSort = new int[]{4,9,4,4,4,8,3,5,10,94,1,2, 89, 67, 34, 20,48};
        sort(arrayToSort, 0 , arrayToSort.length - 1);
        displayArray(arrayToSort);
    }

    public static void displayArray(int[] array){
        for(int i : array){
            System.out.print(i+ " ");
        }
        System.out.println();
    }

}
