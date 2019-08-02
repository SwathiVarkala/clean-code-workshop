package com.movierental;

import org.junit.Assert;
import org.junit.Test;


public class CustomerTest {
    @Test
    public void shouldReturnStatement(){
        Customer customer = new Customer("Swathi");
        customer.addRental(new Rental(new Movie("Okkadu", 0), 10));
        customer.addRental(new Rental(new Movie("One", 1), 10));
        customer.addRental(new Rental(new Movie("Om", 2), 10));
        String statement = customer.statement();
        Assert.assertEquals(statement, "Rental Record for Swathi\n" +
                "\tOkkadu\t14.0\n" +
                "\tOne\t30.0\n" +
                "\tOm\t12.0\n" +
                "Amount owed is 56.0\n" +
                "You earned 4 frequent renter points");
    }

    @Test
    public void shouldReturnStatementForDifferentDaysRented(){
        Customer customer = new Customer("Swathi");
        customer.addRental(new Rental(new Movie("Okkadu", 0), 2));
        customer.addRental(new Rental(new Movie("Om", 2), 1));
        String statement = customer.statement();
        Assert.assertEquals(statement, "Rental Record for Swathi\n" +
                "\tOkkadu\t2.0\n" +
                "\tOm\t1.5\n" +
                "Amount owed is 3.5\n" +
                "You earned 2 frequent renter points");
    }
}