package com.pranesh.strategy;

/**
 * Created by sai pranesh on 27-Mar-17.
 */
public class Main {

    public static void main (String args[]){

        Duck mallardDuck = new MallardDuck();
        mallardDuck.flyAbility();
        mallardDuck.quackAbility();

        mallardDuck.setFlybehaviour(new FlyWithWings());
        mallardDuck.flyAbility();
    }
}
