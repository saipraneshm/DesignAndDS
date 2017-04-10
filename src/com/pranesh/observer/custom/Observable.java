package com.pranesh.observer.custom;

/**
 * Created by sai pranesh on 27-Mar-17.
 */
public interface Observable {

    void addObserver( Observers observers );
    void removeObserver( Observers observers );
    void notifyObservers();
    void setMeasurements(float temp, float pressure);
}
