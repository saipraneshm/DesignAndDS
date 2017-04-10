package com.pranesh.strategy;

/**
 * Created by sai pranesh on 27-Mar-17.
 */
public class Duck {

    FlyBehaviour flybehaviour;
    QuackBehaviour quackBehaviour;


    public void flyAbility(){
        flybehaviour.display();
    }

    public void quackAbility(){
        quackBehaviour.display();
    }

    public void setFlybehaviour(FlyBehaviour flybehaviour) {
        this.flybehaviour = flybehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}

