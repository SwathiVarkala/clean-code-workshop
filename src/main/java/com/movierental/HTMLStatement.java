package com.movierental;

public class HTMLStatement {

    private final String customerName;
    private final Rentals rentals;

    public HTMLStatement(String customerName, Rentals rentals) {
        this.customerName = customerName;
        this.rentals = rentals;
    }

    public String statement() {
        String statement = "<h3>Rental Record for <b>" + customerName + "</b></h3><p>";
        for (Rental rental : rentals) {
            statement += rental.getMovie().getTitle() + "<b>" + rental.movie.amount(rental.getDaysRented()) + "</b><br>";
        }

        statement += "Amount owed is <b>" + rentals.totalRentalAmount() + "</b><br>";
        statement += "You earned <b>" + rentals.frequentRenterPoints() + "</b> frequent renter points</p>";
        return statement;
    }
}