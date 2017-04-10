package com.pranesh.observer.custom;

/**
 * Created by sai pranesh on 27-Mar-17.
 */
public class StatisticsDisplay implements Observers {

    private float temp;
    private float pressure;

    StatisticsDisplay(Observable weatherData){
        weatherData.addObserver(this);
    }

    @Override
    public void update(float temp, float pressure) {
        System.out.println(" Temperature is  " + temp + " and pressure is " + pressure);
    }
}
