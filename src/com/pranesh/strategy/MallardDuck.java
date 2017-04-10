package com.pranesh.strategy;

/**
 * Created by sai pranesh on 27-Mar-17.
 */
public class MallardDuck extends Duck {

    public MallardDuck(){
        flybehaviour = new FlyWithRockets();
        quackBehaviour = new LoudQuack();
    }

}
