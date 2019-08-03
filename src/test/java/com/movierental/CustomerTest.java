package com.movierental;

import org.junit.Assert;
import org.junit.Test;


public class CustomerTest {
    @Test
    public void shouldReturnStatement(){
        Customer customer = new Customer("Swathi");
        customer.rentals.add(new Rental(new Movie("Okkadu", PriceCode.REGULAR), 10));
        customer.rentals.add(new Rental(new Movie("One", PriceCode.NEW_RELEASE), 10));
        customer.rentals.add(new Rental(new Movie("Om", PriceCode.CHILDRENS), 10));
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
        customer.rentals.add(new Rental(new Movie("Okkadu", PriceCode.REGULAR), 2));
        customer.rentals.add(new Rental(new Movie("Om", PriceCode.CHILDRENS), 1));
        String statement = customer.statement();
        Assert.assertEquals(statement, "Rental Record for Swathi\n" +
                "\tOkkadu\t2.0\n" +
                "\tOm\t1.5\n" +
                "Amount owed is 3.5\n" +
                "You earned 2 frequent renter points");
    }

    @Test
    public void shouldReturnHtmlStatement(){
        Customer customer = new Customer("Swathi");
        customer.rentals.add(new Rental(new Movie("Okkadu", PriceCode.REGULAR), 2));
        customer.rentals.add(new Rental(new Movie("Om", PriceCode.CHILDRENS), 1));
        String statement = customer.htmlStatement();
        Assert.assertEquals("<h3>Rental Record for <b>Swathi</b></h3>" +
                "<p>Okkadu<b>2.0</b><br>" +
                "Om<b>1.5</b><br>" +
                "Amount owed is <b>3.5</b><br>" +
                "You earned <b>2</b> frequent renter points</p>",
                statement);
    }
}