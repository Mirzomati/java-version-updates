package com.cydeo;

public enum Currrency {

    PENNY(1),NICKLE(5),DIME(10), QUARTER(25);

    private int value;

    Currrency(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
