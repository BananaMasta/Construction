package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        CarInfo car = new CarInfo("Bugatti", Colors.BLUE, 380, 30000000, new Engine(1000, 3600));
//        List<Wheel> wheels = new ArrayList<>();
//        wheels.add(new Wheel("Left Front"));
//        wheels.add(new Wheel("Right Front"));
//        wheels.add(new Wheel("Left Rear"));
//        wheels.add(new Wheel("Right Rear"));
//        car.setWheels(wheels);
//        for (Wheel w : wheels) {
//            System.out.println(w.getPosition());
//        }
        List<Car> cars = new ArrayList<>();
        Car car = new Car();
        Car car2 = new Car();
        Human human = new Human();
        car.setModel("Tesla");
        car2.setModel("Lada");
        cars.add(car);
        cars.add(car2);
        human.setCars(cars);
        for (Car c: cars) {
            System.out.println(c.getModel());
        }

    }


}
