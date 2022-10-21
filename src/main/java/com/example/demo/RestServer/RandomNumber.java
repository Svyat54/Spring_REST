package com.example.demo.RestServer;

public class RandomNumber {
    int number;

    public Integer getNumber() {
        return number;
    }

    public RandomNumber() {
        this.number = (int) (Math.random() * 100);
    }

    public RandomNumber(int min, int max) {
        this.number = (int) (Math.random() * (max - min)) + (min + 1);
    }
}
