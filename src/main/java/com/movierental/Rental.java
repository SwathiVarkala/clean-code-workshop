package com.movierental;

public class Rental {

    private int daysRented;
    Movie movie;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    double amount() {
        return movie.amount(daysRented);
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

}