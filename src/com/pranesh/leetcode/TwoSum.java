package com.pranesh.leetcode;

import java.util.HashMap;

/**
 * Created by saip92 on 7/4/2017.
 */
public class TwoSum {


    public static int[] twoSum(int[] nums, int target){

        HashMap<Integer, Integer> storeDifference = new HashMap<>();
        int[] result = new int[2];
        int targetToAchieve = target;

        for(int i = 0 ; i < nums.length; i++){
            if(storeDifference.containsKey(nums[i])){
                result[0] = storeDifference.get(nums[i]);
                result[1] = i;
                break;
            }else{
                storeDifference.put((targetToAchieve - nums[i]),i);
            }

        }
        return result;
    }

    public static void main(String[] args) {
        for(Integer i : twoSum(new int[]{2,7,11,15}, 26)){
            System.out.print(i + " ");
        }
    }
}
