package com.example.demo.common.domain;

public class Boss {
    private int value = 2;

    private Car car;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    public String say() {
        System.out.println("i have a Car name " + car.getName());
        return "i have a Car name "+car.getName();
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
