package com.movierental;

import java.util.ArrayList;

public class Rentals extends ArrayList<Rental>{

    int frequentRenterPoints() {
        int frequentRenterPoints = 0;
        for (Rental rental : this) {
            frequentRenterPoints += rental.movie.frequentRenterPoints(rental.getDaysRented());
        }
        return frequentRenterPoints;
    }

    double totalRentalAmount() {
        double totalRentalAmount = 0;
        for (Rental rental : this) {
            double amount = rental.movie.amount(rental.getDaysRented());
            totalRentalAmount += amount;
        }
        return totalRentalAmount;
    }

}