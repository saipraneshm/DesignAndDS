package com.pranesh.hackerrank.test;

import java.util.Arrays;

/**
 * Created by saip92 on 7/17/2017.
 */
public class Equal {

    public static int equalOperations(int[] arr){
        Arrays.sort(arr);
        int count = 0;
        for(int i = 0 ; i < arr.length -1 ; i++){
            if(arr[i] != arr[i+1]){
                int difference = arr[i+1] - arr[i];
                int num = difference;
                if( num >= 5 ){
                    count += num / 5;
                    num = num % 5;
                }

                if(num >= 3){
                    count += num / 3;
                    num = num %3;
                }

                if(num >= 1){
                    count += num;
                }
                addValue(arr,i+1, difference);
            }
        }



        return count;
    }

    public static void addValue(int[] arr, int target, int addValue){
        for(int i = 0; i < arr.length; i++){
            if(i != target){
                arr[i] += addValue;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(equalOperations(new int[]{1,5,5,10,10}) + " minimum number of operations");
    }
}
