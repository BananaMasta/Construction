package com.company;

import java.util.ArrayList;
import java.util.List;

public class Human {

    private String car;
    private List<Car> cars = new ArrayList<>();

    public void setCar(String car) {
        this.car = car;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
