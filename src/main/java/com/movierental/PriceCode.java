package com.movierental;

public enum PriceCode {
    REGULAR(0),
    NEW_RELEASE(1),
    CHILDRENS(2),
    BLURAY(3);

    private int value;

    public int getValue() {
        return value;
    }

    PriceCode(int priceCode) {
        this.value = priceCode;
    }
}