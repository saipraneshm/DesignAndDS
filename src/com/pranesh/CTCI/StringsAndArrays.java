package com.pranesh.CTCI;

import java.util.Arrays;

/**
 * Created by sai pranesh on 5/21/2017.
 */
public class StringsAndArrays {

    public static void main (String [] args){
        StringsAndArrays stringsAndArrays = new StringsAndArrays();
        //System.out.println(stringsAndArrays.isStringUnique("bacdefghijklanopqrstuvwxyz"));
        //System.out.println(stringsAndArrays.isUniqueChars("bacdefghijklmnopqrstuvwxyz"));
        //System.out.println("abcd".compareTo("dcba"));
        //System.out.println(stringsAndArrays.sortString("asdkjfhakjdhfa"));
        //System.out.println(stringsAndArrays.stringPermutations2("aasasshh","bbaahhss"));
        //String temp = "Mr John Smith ";
        //char[] char_temp = temp.toCharArray();
        //System.out.println( new String(char_temp));
        //System.out.println(stringsAndArrays.URLify("Priya Sai Pradeep Rukumini Mukkala                ", 34) + " ");

       /* System.out.println(Character.getNumericValue('z')  - Character.getNumericValue('a') + 1);
        System.out.println(Character.getNumericValue('c')  - Character.getNumericValue('a') + 1);*/

      // System.out.print(stringsAndArrays.isStringPermutation("aabbaa"));

       /* System.out.println(stringsAndArrays.isOneEditAway("pale","pal"));
        System.out.println(stringsAndArrays.isOneEditAway("pale","pals"));
        System.out.println(stringsAndArrays.isOneEditAway("pale","bal"));
        System.out.println(stringsAndArrays.isOneEditAway("pale","bale"));
        System.out.println(stringsAndArrays.isOneEditAway("ball","pallw"));*/

       // System.out.println(stringsAndArrays.stringCompression("aaabbbbaaaacccccssddddfsss"));


    }

    //My method
    private boolean isStringUnique(String words){
        String toCheck = words.substring(1);
        char prevChar = words.charAt(0);
        for( int i = 1 ; i < words.length() ; i++ ){
            if(toCheck.lastIndexOf(prevChar) >= i-1){
                return false;
            }else{
                prevChar = words.charAt(i);
            }
        }
        return true;
    }


    //CCIT method
    private boolean isUniqueChars(String str){
        if(str.length() > 128) return false;

        boolean char_arr[] = new boolean[128];
        for( int i =0 ; i < str.length(); i++ ){
            int char_val = str.charAt(i);
            if(char_arr[char_val]){
                return false;
            }
            char_arr[char_val] = true;
        }
        return true;
    }


    private String sortString(String str){
        char[] char_str = str.toCharArray();
        Arrays.sort(char_str);
        return new String(char_str);
    }


    private boolean stringPermutations(String first, String second){
        if(first.length() != second.length()){
            return false;
        }
        return sortString(first).equals(sortString(second));
    }

    private boolean stringPermutations2(String first, String second){
        if(first.length() != second.length()){
            return false;
        }

        int[] char_arr = new int[128];

        char[] first_array = first.toCharArray();
        for(char c : first_array){
            char_arr[c]++;
        }

        for( int j = 0 ; j < second.length() ; j++){
           int val = (int)second.charAt(j);
           char_arr[val]--;
           if(char_arr[val]< 0){
               return false;
           }
        }

        return true;
    }

    private String URLify(String input , int trueLength){
       System.out.println(input.length() + " is the input length");
        char[] reqChar = input.toCharArray();
        int spaceCount = 0, index, i ;
        for(i = 0; i< trueLength; i ++ ){
            if(reqChar[i] == ' '){
                spaceCount++;
            }
        }

        index = trueLength + spaceCount * 2;
        if(trueLength < input.length()) reqChar[trueLength] = '\0';
        System.out.println(index + " value of the index");
        for( i= trueLength - 1; i > 0 ; i--){
            if(reqChar[i] == ' '){
                reqChar[index - 1] = '0';
                reqChar[index - 2] = '2';
                reqChar[index - 3] = '%';
                index = index - 3;
            }else{
                reqChar[index-1] = reqChar[i];
                index--;
            }
            System.out.println(index + " value at each pass");
        }
        return new String(reqChar);
    }


    private boolean isStringPermutation(String str){
        int[] table = buildCharFreqTable(str);
        return checkMaxOneOdd(table);
    }

    private boolean checkMaxOneOdd(int[] table){
        boolean countOdd = false;
        for(int i = 1 ; i < table.length ; i ++){
            if(table[i] % 2 == 1){
                if(countOdd){
                    return false;
                }
                countOdd = true;
            }
        }
        return true;
    }

    private int getCharacterInt(char val){
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        if(a <= val && val <= z ){
            return val - a;
        }
        return -1;
    }

    private int[] buildCharFreqTable(String str){
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for( char c : str.toCharArray()){
            int val = getCharacterInt(c);
            if(val != -1)
                table[val]++;
        }
        return table;
    }

    private boolean isOneEditAway(String first, String second){
        if(first.length() == second.length()){
            return isOneEditReplace(first , second);
        }else if( first.length() + 1 == second.length()){
            return isOneEditInsert(first , second);
        }else if( first.length() - 1 == second.length()){
            return isOneEditInsert(second, first);
        }
        return false;
    }

    //In this case we are just checking for one difference, if we get more than that
    //we are switching the flag to false.
    private boolean isOneEditReplace(String first, String second){
        boolean foundDifference = false;
        for(int i = 0 ; i < first.length(); i++){
            if( first.charAt(i) != second.charAt(i)){
                if(foundDifference) return false;
                foundDifference = true;
            }
        }
        return true;
    }

    //A common method to implement both insert and removal.
    private boolean isOneEditInsert(String first, String second){
        int index1 = 0 , index2 = 0;
        while( index1 < first.length() && index2 < second.length() ){
            if( first.charAt(index1) != second.charAt(index2)){
                if(index1 != index2){
                    return false;
                }
                index2++;
            }else{
                index1++;
                index2++;
            }
        }
        return true;
    }

    private String stringCompression(String compression){

        StringBuilder sb = new StringBuilder();

        int charCount = 0;
        for( int i = 0 ; i < compression.length() ; i++){
           // System.out.println(" " + compression.charAt(i) + " index -> " + i);
            charCount++;
            if( i + 1 >= compression.length() || compression.charAt(i) != compression.charAt(i+1)){
                sb.append(compression.charAt(i)).append(charCount);
                charCount = 0;
            }
        }

       // System.out.println(sb.toString() + "= required value");
        return compression.length() < sb.length() ? compression : sb.toString();
    }
}
