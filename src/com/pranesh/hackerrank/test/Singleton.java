package com.pranesh.hackerrank.test;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by saip92 on 9/19/2017.
 */
public class Singleton {
    private volatile static Singleton sInstance;
    private String url;
    private Singleton(String url){
        this.url = url;
    }

    public static Singleton getsInstance(String url){
        if(sInstance == null){
            sInstance = new Singleton(url);
        }
        return sInstance;
    }

    public static void main(String[] args) {

        Map<String,String> test1 = new LinkedHashMap<>();
        test1.put("a","1");
        test1.put("b","2");
        test1.put("c","3");

        Map<String,String> test2 = new LinkedHashMap<>();
        test1.put("d","4");
        test1.put("e","5");
        test1.put("f","6");

        test1.putAll(test2);

        System.out.println(test1 + " ");

    }
}
