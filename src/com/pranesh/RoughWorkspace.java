package com.pranesh;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by sai pranesh on 5/22/2017.
 */
public class RoughWorkspace {

    public static void main(String[] args) {


        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(1);
        ll.add(4);
        ll.add(94);
        ll.add(123);
        ll.add(23);
        ll.add(2389);
        ll.add(23);
        ll.add(342);


        int firstIndex = 0;
        int secondIndex = ll.size() / 2 ;


      /* for( ; firstIndex < ll.size() ; firstIndex ++){
           for( ; secondIndex < ll.size() ; secondIndex ++){
               if(ll.get(firstIndex).equals(ll.get(secondIndex))){
                   System.out.println("duplicate found");
                   return;
               }
           }
       }*/

    }

    private static void print(String str){
        System.out.println(str);

    }
}
