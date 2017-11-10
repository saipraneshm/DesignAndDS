package com.pranesh.hackerrank;

import java.util.HashMap;

/**
 * Created by saip92 on 7/5/2017.
 */
public class CoinChange {

    public static long makeChange(int[] coins, int money){
        return makeChange(coins, money, 0, new HashMap<String, Integer>());
    }

    public static long makeChange(int[] coins, int money, int index, HashMap<String, Integer> memo){

        if(money == 0){
            return 1;
        }
        if( index >= coins.length){
            return 0;
        }

        int amountWithCoin = 0;
        int ways = 0;
        String key = money + "-" + index;
        if(memo.containsKey(key)){
            return memo.get(key);
        }

        while(amountWithCoin <= money){
            int remaining = money - amountWithCoin;
            ways += makeChange(coins, remaining, index + 1, memo);
            amountWithCoin += coins[index];
        }
        memo.put(key, ways);
        return ways;

    }




    public static void main(String[] args) {

    }


}
