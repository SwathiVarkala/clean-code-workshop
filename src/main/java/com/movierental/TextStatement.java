package com.movierental;

public class TextStatement {
    private String name;
    private final Rentals rentals;

    public TextStatement(String name, Rentals rentals) {
        this.name = name;
        this.rentals = rentals;
    }

    public String statement() {
        String statement = "Rental Record for " + name + "\n";
        for (Rental rental : rentals) {
            statement += "\t" + rental.getMovie().getTitle() + "\t" + rental.movie.amount(rental.getDaysRented()) + "\n";
        }

        statement += "Amount owed is " + rentals.totalRentalAmount() + "\n";
        statement += "You earned " + rentals.frequentRenterPoints() + " frequent renter points";
        return statement;
    }
}