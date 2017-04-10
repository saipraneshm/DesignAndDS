package com.pranesh.strategy;

/**
 * Created by sai pranesh on 27-Mar-17.
 */
public class NoFly implements FlyBehaviour {

    @Override
    public void display() {
        System.out.println("Unfortunately I cannot fly with my wings being damaged");
    }
}
