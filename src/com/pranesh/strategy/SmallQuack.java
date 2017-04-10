package com.pranesh.strategy;

/**
 * Created by sai pranesh on 27-Mar-17.
 */
public class SmallQuack implements QuackBehaviour {

    @Override
    public void display() {
            System.out.println("Quack Quack - small quack");
    }

}
