package com.pranesh.leetcode;

import com.pranesh.CTCI.LinkedList;
import com.sun.deploy.util.StringUtils;

import java.util.Arrays;
import java.util.Queue;

/**
 * Created by saip92 on 7/4/2017.
 */
public class LeetCodeWorkSpace {


    public static double findMedianSortedArray(int[] nums1, int[] nums2) {
        int[] sortedArray = mergeTwoArrays(nums1, nums2);
        int length = sortedArray.length;

        if ((length % 2) == 0) {
            int midIndex = (length / 2) - 1;
            return ((double) sortedArray[midIndex] + sortedArray[midIndex + 1]) / 2;
        } else {
            return (double) sortedArray[length / 2];
        }
    }

    public static int[] mergeTwoArrays(int[] nums1, int[] nums2) {
        int nums1Index = 0, nums2Index = 0;
        int index = 0;
        int size = nums1.length + nums2.length;
        int[] temp = new int[size];

        while (nums1Index <= nums1.length - 1 && nums2Index <= nums2.length - 1) {
            if (nums1[nums1Index] < nums2[nums2Index]) {
                temp[index] = nums1[nums1Index];
                nums1Index++;
            } else {
                temp[index] = nums2[nums2Index];
                nums2Index++;
            }
            index++;
        }

        System.arraycopy(nums1, nums1Index, temp, index, nums1.length - nums1Index);
        System.arraycopy(nums2, nums2Index, temp, index, nums2.length - nums2Index);
        return temp;
    }


    public static void main(String[] args) {
       new newthread();
    }


    static int fact(int n) {
        int result;
        if (n == 1)
            return 1;
        result = fact(n - 1) * n;
        return result;
    }


    private static void reverseString() {
        String input = "Helloorld";
        System.out.println(input);
        int strLength = input.length() - 1;
        char[] givenString = input.toCharArray();
        for (int i = 0; i < input.length() / 2; i++) {
            char temp = givenString[i];
            givenString[i] = givenString[strLength - i];
            givenString[strLength - i] = temp;
        }

        System.out.println(String.valueOf(givenString));
    }

    static class newthread implements Runnable {
        Thread t1,t2;

        newthread() {
            t1 = new Thread(this, "Thread_1");
            t2 = new Thread(this, "Thread_2");
            t1.start();
            t2.start();
        }

        public void run() {
            t2.setPriority(Thread.MAX_PRIORITY);
            System.out.print(t1.equals(t2));
        }
    }



}
