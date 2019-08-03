package com.movierental;

public class Customer {
    private String name;
    final Rentals rentals = new Rentals();

    public Customer(String name) {
        this.name = name;
    }

    public String statement() {
        return new TextStatement(name, rentals).statement();
    }

    public String htmlStatement() {
        return new HTMLStatement(name, rentals).statement();
    }

}

