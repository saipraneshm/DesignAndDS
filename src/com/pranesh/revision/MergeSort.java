package com.pranesh.revision;

/**
 * Created by saip92 on 7/30/2017.
 */
public class MergeSort {

    public static void mergeSort(int[] array){
        mergeSort(array, new int[array.length], 0 , (array.length - 1));
    }

    private static void mergeSort(int[] array, int[] temp, int left, int right){
        if(left >= right) return;

        int middle = (left + right) / 2;
        mergeSort(array, temp, left, middle);
        mergeSort(array, temp, middle + 1, right);
        mergeHalves(array, temp, left, right);

    }

    private static void mergeHalves(int[] array, int[] temp, int leftStart, int rightEnd) {
        for(int i = leftStart; i <= rightEnd; i++){
            temp[i] = array[i];
        }

        int middle = (leftStart + rightEnd) / 2;
        int currentIndex = leftStart;
        int left = leftStart;
        int right = middle+1;
        while(left <= middle && right <= rightEnd){
            if(temp[left] <= temp[right]){
                array[currentIndex] = temp[left];
                left++;
            }else{
                array[currentIndex] = temp[right];
                right++;
            }
            currentIndex++;
        }

        int remaining = middle - left;
        for(int i = 0 ; i <= remaining; i++){
            array[currentIndex + i] = temp[left + i];
        }

    }

    public static void main(String[] args) {
        int[] arrayToSort = new int[]{4,9,4,4,4,8,3,5,10,94,1,2, 89, 67, 34, 20,48};
        mergeSort(arrayToSort);
        displayArray(arrayToSort);
    }

    public static void displayArray(int[] array){
        for(int i : array){
            System.out.print(i+ " ");
        }
        System.out.println();
    }
}
