package com.pranesh.datastructures.recursion;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by saip92 on 7/30/2017.
 */
public class KnapsackProblem {


    static int sum;
    static List<Integer> solution = new LinkedList<>();

    public static List<Integer> findWeights(List<Integer> items, int target, int index){
        if(sum < target && index < items.size()-1) {
            sum += items.get(index);
            System.out.println("sum: " + sum +", target: " + target +", indeX: " + index);
            System.out.println(solution.toString() +" solution list");
            if (sum == target) {
                solution.add(items.get(index));
                return solution;
            }
            if (sum > target) {
                findWeights(items, target, index + 1);
            }
            if (sum < target) {
                solution.add(items.get(index + 1));
                int newTarget = target - sum;
                findWeights(items, newTarget, index + 1);
            }
        }
       return null;
    }

    public static List<Integer> findWeights(List<Integer> items, int target){
        int index = 0;
        while(index < items.size()){
            int newTarget = target - items.get(index);
            //sum += items.get(index);
            solution.add(items.get(index));
            System.out.println("Entering recurse with sum: " + sum +", index: " + index +", newTarget: " + newTarget);
            List<Integer> sol = findWeights(items, newTarget, index);
            if(sol != null) { return sol; }
            solution = new LinkedList<>();
            index++;
            sum = 0;
        }
        return null;
    }


    public static void main(String[] args) {
        LinkedList<Integer> availableItems = new LinkedList<>();
        availableItems.add(11);
        availableItems.add(8);
        availableItems.add(7);
        availableItems.add(6);
        availableItems.add(5);
        System.out.println(availableItems.toString());

        PriorityQueue<Integer> pq= new PriorityQueue<>((o1, o2) -> 0);
        List<Integer> knapsackItems = findWeights(availableItems, 20);
        if(knapsackItems != null && knapsackItems.size() > 0)
        for(Integer i : knapsackItems){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
