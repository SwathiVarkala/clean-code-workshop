package com.movierental;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;


    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        String statement = "Rental Record for " + getName() + "\n";
        for (Rental rental : rentals) {
            statement += "\t" + rental.getMovie().getTitle() + "\t" + rental.amount() + "\n";
        }

        statement += "Amount owed is " + totalRentalAmount() + "\n";
        statement += "You earned " + frequentRenterPoints() + " frequent renter points";
        return statement;
    }

    private int frequentRenterPoints() {
        int frequentRenterPoints = 0;
        for (Rental rental : rentals) {
            frequentRenterPoints += rental.frequentRenterPoints();
        }
        return frequentRenterPoints;
    }

    private double totalRentalAmount() {
        double totalRentalAmount = 0;
        for (Rental rental : rentals) {
            double amount = rental.amount();
            totalRentalAmount += amount;
        }
        return totalRentalAmount;
    }
}

