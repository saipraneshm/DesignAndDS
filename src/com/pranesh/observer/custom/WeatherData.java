package com.pranesh.observer.custom;

import java.util.ArrayList;

/**
 * Created by sai pranesh on 27-Mar-17.
 */
public class WeatherData implements Observable {

    ArrayList<Observers> observersList;
    private float temp;
    private float pressure;

    WeatherData(){
        observersList = new ArrayList<>();
    }

    @Override
    public void addObserver(Observers observers) {
        observersList.add(observers);
    }

    @Override
    public void removeObserver(Observers observers) {
        if(observersList.contains(observers)){
            int i = observersList.indexOf(observers);
            observersList.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for(Observers observer : observersList){
            observer.update(temp, pressure);
        }
    }

    @Override
    public void setMeasurements(float temp, float pressure) {
        this.temp = temp;
        this.pressure = pressure;
        notifyObservers();
    }

    public float getTemp() {
        return temp;
    }

    public float getPressure() {
        return pressure;
    }
}
