package com.company;

public class CarInfo  {
    private int topSpeed;
    private int price;
    private String carName;
    private Colors color;
    private Engine engine;


    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public CarInfo(String carName, Colors color, int topSpeed, int price, Engine engine) {
//        this.topSpeed = topSpeed;
//        this.price = price;
//        this.carName = carName;
//        this.color = color;
//        this.engine = engine;
        System.out.println(color.getColorRus());
    }
    public CarInfo(){

    }
}

