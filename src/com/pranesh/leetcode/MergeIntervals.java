package com.pranesh.leetcode;

import java.util.*;

/**
 * Created by saip92 on 9/1/2017.
 */
public class MergeIntervals {

    static class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }

        @Override
        public String toString() {
            return "start: " + start + ", end: " + end;
        }
    }

    public static void main(String[] args) {
        List<Interval> existingList = new LinkedList<>();
        existingList.add(new Interval(1,3));
        existingList.add(new Interval(0,4));
        existingList.add(new Interval(2,5));

        existingList.sort(new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                if (o1.start < o2.start) {
                    return -1;
                }else{
                    return 1;
                }
            }
        });


        int[][] test = new int[4][5];
        System.out.println(test.length  + " length of row, " + test[0].length + " length of col");
        System.out.println((int) System.currentTimeMillis() + " current time in millis");
        // System.out.println(existingList.toString());
    }

    public int lengthOfLongestSubstring(String s) {
        Queue<Integer> queue = new LinkedList<>();
        queue.remove();
        List<List<Integer>> result = new LinkedList<>();

        //result.add(new LinkedList<>().add());
        LinkedList<Integer> h = new LinkedList<>();

        result.add(new LinkedList<>(Collections.singletonList(6)));

        int maxLength = Integer.MIN_VALUE;
        HashSet<Character> uniqueChars = new HashSet<>();
        int counter1 = 0;
        int counter2 = 1;
        uniqueChars.add(s.charAt(counter1));
        while(counter1 < s.length() && counter2 < s.length()-1){
            System.out.println(uniqueChars);
            if(uniqueChars.contains(s.charAt(counter2))){
                int length = uniqueChars.size();
                if(length >= maxLength){
                    maxLength = length;
                }
                uniqueChars.clear();
                counter1++;
                counter2 = counter1+1;
            }else{
                uniqueChars.add(s.charAt(counter2));
                counter2++;
            }
        }
        return maxLength;
    }
}
