package com.pranesh.strategy;

/**
 * Created by sai pranesh on 27-Mar-17.
 */
public class RubberDuck extends Duck {

    RubberDuck(){
        flybehaviour = new NoFly();
        quackBehaviour = new LoudQuack();
    }

}

