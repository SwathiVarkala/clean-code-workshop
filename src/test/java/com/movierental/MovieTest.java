package com.movierental;

import org.junit.Assert;
import org.junit.Test;

public class MovieTest {

    @Test
    public void shouldValidateAmount(){
        Movie regular = new Movie("New Release", 0);
        Movie newRelease = new Movie("One", 1);
        Movie children = new Movie("One", 2);
        Assert.assertEquals(14, regular.amount(10), 0);
        Assert.assertEquals(30, newRelease.amount(10), 0);
        Assert.assertEquals(12, children.amount(10), 0);
    }

    @Test
    public void shouldValidateAmountWithInMinDays(){
        Movie regular = new Movie("New Release", 0);
        Movie newRelease = new Movie("One", 1);
        Movie children = new Movie("One", 2);
        Assert.assertEquals(2, regular.amount(1), 0);
        Assert.assertEquals(6, newRelease.amount(2), 0);
        Assert.assertEquals(1.5, children.amount(1), 0);
    }

    @Test
    public void shouldValidateFRP(){
        Movie regular = new Movie("New Release", 0);
        Movie newRelease = new Movie("One", 1);
        Movie children = new Movie("One", 2);
        Assert.assertEquals(1, regular.frequentRenterPoints(10));
        Assert.assertEquals(2, newRelease.frequentRenterPoints(10));
        Assert.assertEquals(1, children.frequentRenterPoints(10));
    }

    @Test
    public void shouldValidateFRPWithInMinDays(){
        Movie regular = new Movie("New Release", 0);
        Movie newRelease = new Movie("One", 1);
        Movie children = new Movie("One", 2);
        Assert.assertEquals(1, regular.frequentRenterPoints(1));
        Assert.assertEquals(2, newRelease.frequentRenterPoints(2));
        Assert.assertEquals(1, children.frequentRenterPoints(1));
    }
}