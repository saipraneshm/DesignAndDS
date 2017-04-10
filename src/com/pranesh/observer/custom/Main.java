package com.pranesh.observer.custom;

/**
 * Created by sai pranesh on 27-Mar-17.
 */
public class Main {


    public static void main(String args [] ){
        Observable weatherData = new WeatherData();

        Observers observers = new StatisticsDisplay(weatherData);
        Observers observers1 = new StatisticsDisplay(weatherData);
        Observers observers2 = new StatisticsDisplay(weatherData);


        weatherData.setMeasurements(34, 45);

    }
}
