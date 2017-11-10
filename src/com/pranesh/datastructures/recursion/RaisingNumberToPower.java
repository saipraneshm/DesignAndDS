package com.pranesh.datastructures.recursion;

/**
 * Created by saip92 on 7/30/2017.
 */
public class RaisingNumberToPower {

    public static int valueOfx;
    public static int raiseToPower(int x , int y) {
        if( y == 1){
            //System.out.println("x: " + x +", y: " + y +", returning x");
            return x;
        }else{
            //System.out.println("Entering else with: x: " + x +", y: " + y);
            x *= x;
            y /= 2;
            int result = raiseToPower(x,y);
            if(y%2 != 0){
                result *= valueOfx;
            }
            //System.out.println("Exiting with x: " + x +", y: " + y +", result: " + result);
            return result;
        }
    }

    public static void main(String[] args) {
        valueOfx = 3;
        System.out.println(raiseToPower(3,18));
    }
}
