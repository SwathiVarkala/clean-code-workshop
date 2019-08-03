package com.movierental;

public class NewReleaseMovieType extends MovieType {
    @Override
    public double amount(int daysRented) {
        double amount = daysRented * 3;
        return amount;
    }

    @Override
    public int frequentRenterPoints(int daysRented) {
        int frequentRenterPoints = 1;
        if (isBonusApplicable(daysRented))
            frequentRenterPoints++;
        return frequentRenterPoints;
    }

    private boolean isBonusApplicable(int daysRented) {
        return daysRented > 1;
    }
}
