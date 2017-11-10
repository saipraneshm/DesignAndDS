package com.pranesh.hackerrank;

/**
 * Created by saip92 on 7/3/2017.
 */
public class Recursion {


    public static int fibonacci(int number){
        if(number == 0) {
            return 0;
        }else if(number == 1){
            return 1;
        }else{
            return (fibonacci(number-1) + fibonacci(number - 2));
        }
    }

    public static int fibonacci(int number, int[] memo){
        if(number == 0){
            return 0;
        }else if(number == 1){
            return 1;
        }else if(memo[number] == 0){
            memo[number] = fibonacci(number - 1) + fibonacci(number - 2);
        }
        return memo[number];
    }

    public static void main(String[] args) {

        System.out.println(fibonacci(41 , new int[42]));
    }

}
