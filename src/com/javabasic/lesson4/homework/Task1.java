package com.javabasic.lesson4.homework;

public class Task1 {
    public static void main(String[] args) {
        String typeFirstAircraft = "Jet";
        String nameFirstAircraft = "F-22 Raptor";
        printAirplaneInfo(typeFirstAircraft, nameFirstAircraft);

        String typeSecondAircraft = "Airliner";
        String nameSecondAircraft = "Aerobus 737";
        int passengersEconomSecondAircraft = 120;
        printAirplaneInfo(typeSecondAircraft, nameSecondAircraft, passengersEconomSecondAircraft);

        String typeThirdAircraft = "Airliner";
        String nameThirdAircraft = "Boeing 777";
        int passengersEconomThirdAircraft = 180;
        int passengersBusinessThirdAircraft = 28;
        printAirplaneInfo(typeThirdAircraft, nameThirdAircraft, passengersEconomThirdAircraft, passengersBusinessThirdAircraft);
    }

    public static void printAirplaneInfo(String typeAircraft, String nameAircraft) {
        System.out.println("Тип самолета: " + typeAircraft + ", модель: " + nameAircraft);
    }

    public static void printAirplaneInfo(String typeAircraft, String nameAircraft, int passengersEconom) {
        System.out.println("Тип самолета: " + typeAircraft + ", модель: " + nameAircraft + ", кол. пасажиров эконом класса: " + passengersEconom);
    }

    public static void printAirplaneInfo(String typeAircraft, String nameAircraft, int passengersEconom, int passengersBusiness) {
        System.out.println("Тип самолета: " + typeAircraft + ", модель: " + nameAircraft + ", кол. пасажиров эконом класса: " + passengersEconom + ", пасажиров бизнес скласса: " + passengersBusiness);
    }
}
