package com.movierental;

public class Movie {

  private String title;
  private PriceCode priceCode;

  public Movie(String title, PriceCode priceCode) {
    this.title = title;
    this.priceCode = priceCode;
  }

  public PriceCode getPriceCode() {
    return priceCode;
  }

  public String getTitle() {
    return title;
  }

  double amount(int daysRented) {
      double amount = 0;
      switch (this.getPriceCode()) {
          case REGULAR:
              amount += 2;
              if (daysRented > 2)
                  amount += (daysRented - 2) * 1.5;
              break;
          case NEW_RELEASE:
              amount += daysRented * 3;
              break;
          case CHILDRENS:
              amount += 1.5;
              if (daysRented > 3)
                  amount += (daysRented - 3) * 1.5;
              break;
      }
      return amount;
  }

  int frequentRenterPoints(int daysRented) {
      int frequentRenterPoints = 1;
      if (isBonusApplicable(daysRented))
          frequentRenterPoints++;
      return frequentRenterPoints;
  }

  private boolean isBonusApplicable(int daysRented) {
      return (getPriceCode() == PriceCode.NEW_RELEASE) && daysRented > 1;
  }

}