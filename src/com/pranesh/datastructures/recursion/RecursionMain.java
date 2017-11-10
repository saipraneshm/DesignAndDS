package com.pranesh.datastructures.recursion;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * Created by sai pranesh on 6/19/2017.
 */
public class RecursionMain {

    public static void main(String[] args) {
       // int number = triangularNumber(5);

        System.out.println(fibonacci(40, new Hashtable<>()));
        System.out.println(count);

        count = 0;

        System.out.println(fibonacci(40));
        System.out.println(count);
        //System.out.println(number);
    }

    static int count = 0;

    static int fibonacci(int n, Hashtable<Integer, Integer> memo){
        count++;
        if(n <= 0){
            return 0;
        }else if( n== 1){
            return 1;
        }
        if(!memo.contains(n)) {
            memo.put(n, fibonacci(n - 1, memo) + fibonacci(n - 2, memo));
        }
        return memo.get(n);
    }

    static int fibonacci(int n){
        count++;
        if(n <= 0){
            return 0;
        }else if( n== 1){
            return 1;
        }else{
            return (fibonacci(n-1) + fibonacci(n-2));
        }
    }


    private static int triangularNumber(int i){
        System.out.println("Entering with : "  + i);
        if(i == 1){
            return 1;
        }else{
            int temp =  i + triangularNumber(i-1);
            System.out.println("Returning value :" + temp);
            return temp;
        }
    }
}
