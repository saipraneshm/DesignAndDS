package com.pranesh.interviewquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by saip92 on 11/10/2017.
 * This represents a classic implementation of Binary search to find the number of occurrences of a digit in a sorted
 * array
 *
 * example: A[1,1,2,3,3,5,5,5,5,6,6,6,8,8]
 * Input : 5
 * Answer : 4
 *
 * Big O time: O(logn)
 */
public class FindCountInSortedArray {

    public static void main(String[] args) {
        Integer[] integerArray = new Integer[]{1, 1, 2, 3, 3, 5, 5, 5, 5, 6, 6, 6,6,6,6, 8, 8};
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(integerArray));
        System.out.println(findCount(arrayList,6) + ": number of occurrences");
    }

    private static int findOccurrence(List<Integer> arrayList, Integer x, boolean findFirstOccurrence){
        int result = -1;
        int low = 0;
        int high = arrayList.size() - 1;
        int mid;
        while(low <= high){
            mid = (low + high)/2;
            if(arrayList.get(mid).equals(x)){
                result = mid;
                if(findFirstOccurrence){
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }else if(x > arrayList.get(mid)){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }

        return result;
    }

    private static int findCount(List<Integer> arrayList, Integer x){

        int firstOccurrence = findOccurrence(arrayList,x,true);
        if(firstOccurrence == -1){
            return -1;
        }else{
            int lastOccurrence = findOccurrence(arrayList,x, false);
            return (lastOccurrence - firstOccurrence + 1);
        }

    }


}
