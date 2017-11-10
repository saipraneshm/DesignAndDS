package com.pranesh.leetcode;

import java.text.DecimalFormat;
import java.util.*;

/**
 * Created by saip92 on 7/6/2017.
 */
public class ZigZagString {

    public static String convert(String s, int numRows) {
        HashMap<Integer, String> hashMap = generateHashMap(s , numRows);
        return displayZigZagString(hashMap, numRows);
    }

    /*public static HashMap<Integer, String> generateHashMap(String s, int numRows){
        HashMap<Integer, String> hashMap = new HashMap<>();
        for(char c : s.toCharArray() ){
            int randomRow = randomWithRange(0, numRows-1);
            String list = hashMap.get(randomRow);
            if(list == null){
                list = "";
            }
            StringBuilder stringBuilder = new StringBuilder(list);
            hashMap.put(randomRow, stringBuilder.append(c).toString());
        }
        return hashMap;
    }*/


    public static HashMap<Integer, String> generateHashMap(String s, int numRows){
        HashMap<Integer, String> hashMap = new HashMap<>();
        char[] charArr = s.toCharArray();
        int length = charArr.length;
        int charIndex = 0;
        while(length > 0){
            System.out.println("Entering while with length "+ length);
            for(int i =0 ; i < numRows ; i++){
                if(charIndex > charArr.length - 1) break;
                String list = hashMap.get(i);
                if(list == null){
                    list = "";
                }
                StringBuilder stringBuilder = new StringBuilder(list);
                hashMap.put(i, stringBuilder.append(charArr[charIndex]).toString());
                charIndex++;
                length--;
            }
            if(length < 0) break;
            for(int j = numRows - 1 ; j >= 0 ; j++){
                if(charIndex > charArr.length - 1) break;
                String list = hashMap.get(j);
                if(list == null){
                    list = "";
                }
                StringBuilder stringBuilder = new StringBuilder(list);
                hashMap.put(j, stringBuilder.append(charArr[charIndex]).toString());
                charIndex++;
                length--;
            }

        }
        return hashMap;
    }


    public static String displayZigZagString(HashMap<Integer, String> hashMap, Integer numRows){
        StringBuilder zigZag = new StringBuilder();
        for(int i = 0 ; i < numRows; i++){
            String valueToAppend = hashMap.get(i);
            if(valueToAppend == null){
                valueToAppend = "";
            }
            zigZag.append(valueToAppend);
        }
        return zigZag.toString();
    }

    public static int reverse(int x) {
        if(String.valueOf(x).length() == 1) return x;
        String givenInt = String.valueOf(x);
        int arrLength = givenInt.length();
        if(arrLength > 32){ return 0;}

        char[] reverseChar = new char[arrLength];
        int reverseInt = 0;
        for(int i = arrLength - 1; x < 0 ? i > 0: i >= 0 ; i--){
            Integer indexVal = Integer.parseInt(String.valueOf(givenInt.charAt(i)));
            reverseInt += 0;
        }

        String reverseStr = String.valueOf(reverseChar);
        Integer result = Integer.parseInt(reverseStr.trim());
            if(x < 0){
                result = -result;
            }
        return result;
    }



    public static void main(String[] args) {
        /*System.out.println(convert("AB", 4));
        Scanner scanner = new Scanner(System.in);
        char[] t = new char[5];*/

    }



    public static int XORoperation(int x , int y){
        return x ^ y;
    }
}
