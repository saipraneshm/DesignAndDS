package com.pranesh.roughWorkspace;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by saip92 on 8/14/2017.
 */
public class lambdaExpressions {

    public static enum Continents {
        AFRICA,
        ANTARTICA,
        ASIA,
        AUSTRALIA,
        EUROPE,
        NORTHAMERICA,
        SOUTHAMERICA
    }

    public static void main(String[] args) {

        List<Country> countries = new ArrayList<>();

        countries.add(new Country(Continents.ASIA.toString() ,45));
        countries.add(new Country(Continents.ASIA.toString() ,89));
        countries.add(new Country(Continents.ASIA.toString() ,100));
        countries.add(new Country(Continents.AFRICA.toString() ,60));
        countries.add(new Country(Continents.AFRICA.toString() ,96));
        countries.add(new Country(Continents.AFRICA.toString() ,432));


        System.out.println(getPopulation(countries, Continents.ASIA.toString()));
        System.out.println(getPopulation(countries, Continents.AFRICA.toString()));


    }


    static int getPopulation(List<Country> countries, String continent){
        Stream<Country> asia = countries.stream().filter( c -> c.getContinent().equals(continent));
        Stream<Integer> map = asia.map(Country::getPopulation);
        return map.reduce(0,(a, b) -> a + b);
    }

    public static class Country{

        String continent;
        int population;

        Country(String continent, int population){
            this.continent = continent;
            this.population = population;
        }

        public String getContinent() {
            return continent;
        }

        public int getPopulation() {
            return population;
        }

    }

}
