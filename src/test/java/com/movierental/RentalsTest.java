package com.movierental;

import org.junit.Assert;
import org.junit.Test;

public class RentalsTest {
    @Test
    public void shouldReturnStatement(){
        Rentals rentals = new Rentals();
        rentals.add(new Rental(new Movie("Okkadu", 0), 10));
        rentals.add(new Rental(new Movie("One", 1), 10));
        rentals.add(new Rental(new Movie("Om", 2), 10));

        Assert.assertEquals(56.0, rentals.totalRentalAmount(), 0);
        Assert.assertEquals(4, rentals.frequentRenterPoints());
    }

    @Test
    public void shouldReturnStatementForDifferentDaysRented(){
        Rentals rentals = new Rentals();
        rentals.add(new Rental(new Movie("Okkadu", 0), 2));
        rentals.add(new Rental(new Movie("Om", 2), 1));
        Assert.assertEquals(3.5, rentals.totalRentalAmount(), 0);
        Assert.assertEquals(2, rentals.frequentRenterPoints());
    }

}