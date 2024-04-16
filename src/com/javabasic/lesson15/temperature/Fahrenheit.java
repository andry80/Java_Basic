package com.javabasic.lesson15.temperature;

public class Fahrenheit implements Converter {

    public double convert(double value) {
        return (value*1.8) + 32;
    }
}
