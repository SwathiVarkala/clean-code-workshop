package com.movierental;

public class UnKnownMovieType extends MovieType {

    @Override
    int frequentRenterPoints(int daysRented) {
        return 0;
    }
}
