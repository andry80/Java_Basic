package com.javabasic.lesson15.temperature;

public class SuperConvertor {
    double value;
    Converter temp;

    public SuperConvertor(double value, Converter temp) {
        this.value = value;
        this.temp = temp;
    }

    public double Convert() {
        return temp.convert(value);
    }
}
