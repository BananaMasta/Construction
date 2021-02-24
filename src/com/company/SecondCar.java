package com.company;

public class SecondCar extends CarInfo{
    String secondColor;
    int year;

    SecondCar(String carName, Colors color, String secondColor, int year, int topSpeed, int price, Engine engine){
        super(carName, color, topSpeed,price, engine);
        this.secondColor = secondColor;
        this.year = year;
    }
}
