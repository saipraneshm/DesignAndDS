package com.pranesh.leetcode;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/**
 * Created by saip92 on 7/24/2017.
 */
public class CombinationSum {

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        LinkedHashSet<List<Integer>> result = new LinkedHashSet<>();
        HashSet<Integer> hashSet = new HashSet<>();
        HashMap<Integer, Integer> memo = new HashMap<>();
        for(int i : candidates){
            hashSet.add(i);
        }

        for(int i : candidates){
            int count = target / i;
            System.out.println("Count: " + count);
            if(target % i == 0){
                result.add(fillListWithTarget(i, count));
            }
            int temp = i;
            int difference;
            while(count > 0){
                temp = temp*count;
               // System.out.println("HashMap key: " + temp + ", count: " + count);
                difference = target - temp;
                //System.out.println("Difference value: " + difference);
               // System.out.println(memo.toString());
               // System.out.println("HashSet: " + hashSet.contains(memo.get(temp)) + ", temp: " + temp +", memo val: " + memo.get(temp));
                if(memo.containsKey(temp) && hashSet.contains(memo.get(temp))){
                    List<Integer> fillWithRepeat = fillListWithTarget(i, count);
                    fillWithRepeat.add(memo.get(temp));
                    result.add(fillWithRepeat);
                }else{
                    //System.out.println("key: " + temp + ", value: " + difference);
                    memo.put(temp , difference);
                    if(hashSet.contains(memo.get(temp))){
                        List<Integer> fillWithRepeat = fillListWithTarget(i, count);
                        fillWithRepeat.add(memo.get(temp));
                        result.add(fillWithRepeat);
                    }

                }
                temp = i;
                count--;
            }

        }

        List<List<Integer>> test = new LinkedList<>();
        test.addAll(result);
        return test;
    }

    public static List<Integer> fillListWithTarget(int val, int count){
        List<Integer> newList = new LinkedList<>();
        for(int i = 0; i < count;i++){
            newList.add(val);
        }
        return newList;
    }


    public static void main(String[] args) {
        displayListsOfList(combinationSum(new int[]{2,3,6,7},7));
    }

    public static void displayListsOfList(List<List<Integer>> lists){
        for(List<Integer> list : lists){
            for(Integer i : list){
                System.out.print(i + " ");
            }
            System.out.println();
        }

        Path test = Paths.get("");
        test.normalize();

        LinkedList<String> l = new LinkedList<>();
        l.addLast("");
    }

}
