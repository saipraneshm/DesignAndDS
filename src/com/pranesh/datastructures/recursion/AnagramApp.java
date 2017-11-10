package com.pranesh.datastructures.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sai pranesh on 6/19/2017.
 */
public class AnagramApp {

    static int size ;
    static int count;
    static char[] arrChar = new char[100];
    static String[] magicStrings = {"a","e", "i", "o", "u"};
    static String[] validStrings = {"ae", "ea","ei","ia","ie","io","iu","oi","oa","ua"};
    static int testCount = 0;


    public static void main(String[] args) throws IOException {
        System.out.print("Enter a word: ");
       // String input = getString();
        count = 0;

        String input = "aeiou";
        size = input.length();
        for(int i = 0 ; i < size ; i++)
            arrChar[i] = input.charAt(i);
        doAnagram(3);
        
    }

    private static void doAnagram(int newSize){
        if(newSize == 1){
            return;
        }else{
            for(int i = 0 ; i < newSize; i++){
                doAnagram(newSize - 1);
                if(newSize == 2){
                    displayWord();
                    if(isMagicString()){
                        testCount++;
                    }
                }
                rotateWord(newSize);
            }
        }
    }

    public static boolean isMagicString(){
        for(int j = 0; j < size-1 ; j++){
            if(containsPair(arrChar[j], arrChar[j+1])){
                return true;
            }
        }
        return false;
    }

    public static boolean containsPair(char a , char b){
        String check = a + b + "";
        for(String s : validStrings){
            if(check.equals(s)) return true;
        }
        return false;
    }

    private static void displayWord(){
        if( count < 99)
            System.out.print(" ");
        if( count < 9)
            System.out.print(" ");
        System.out.print(++count + " ");
        for(int j = 0; j < size ; j++){
            System.out.print( arrChar[j] );
        }
        System.out.print("   ");
        System.out.flush();
        if(count%6 == 0)
            System.out.println("");
    }

    private static void rotateWord(int newSize){
        int j;
        int position = size - newSize;
        char temp = arrChar[position];
        for(j = position + 1; j < size; j++){
            arrChar[j-1] = arrChar[j];
        }
        arrChar[j-1] = temp;
    }

    private static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(isr);
        String s = bufferedReader.readLine();
        return s;
    }
}
