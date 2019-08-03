package com.movierental;

public abstract class MovieType {

    double amount(int daysRented) {
        return 0;
    }

    int frequentRenterPoints(int daysRented) {
        return 1;
    }
}