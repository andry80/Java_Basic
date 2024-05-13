package com.javabasic.lesson15.temperature;

public class Kelvin implements Converter {

    public double convert(double value) {
        return value + 273.15;
    }
}
