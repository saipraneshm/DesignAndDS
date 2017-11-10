package com.pranesh.hackerrank;

import java.util.Scanner;

/**
 * Created by saip92 on 6/28/2017.
 */
public class LeftShift {


    public static int[] arrayLeftRotation(int[] a, int n, int k) {
        return performLeftRotation(a, k);
    }


    //Recursive approach - failed to pass two test cases
    public static int[] performLeftRotationRecursively(int[] a, int b){
        if(b == 0) return a;
        int[] tempArray = new int[a.length];
        System.arraycopy(a, 1, tempArray, 0, a.length -1 );
        tempArray[a.length - 1] = a[0];
        return performLeftRotationRecursively(tempArray, b-1);
    }

    //Iterative approach to solve the problem
    public static int[] performLeftRotation(int[] a, int b){
        int[] tempArray = new int[a.length];
        System.arraycopy(a,b, tempArray, 0, a.length - b );
        //displayArrayElements(tempArray);
        System.arraycopy(a,0, tempArray, a.length - b , b  );
        //displayArrayElements(tempArray);
        return tempArray;
    }

    public static void displayArrayElements(int[] a){
        System.out.println("\n Displaying elements: ");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
       // output = performLeftRotationRecursively(a, k);
        /*for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");
*/
        System.out.println();

    }


}
