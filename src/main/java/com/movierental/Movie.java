package com.movierental;

public class Movie {

  public static final int CHILDRENS = 2;
  public static final int REGULAR = 0;
  public static final int NEW_RELEASE = 1;

  private String title;
  private MovieType movieType;

  public Movie(String title, int priceCode) {
    this.title = title;
    setMovieType(priceCode);
  }

  public void setPriceCode(int priceCode) {
    setMovieType(priceCode);
  }

  public MovieType getMovieType() {
    return movieType;
  }

  private void setMovieType(int movieType) {
    switch (movieType) {
      case Movie.REGULAR:
        this.movieType = new RegularMovieType();
        break;
      case Movie.NEW_RELEASE:
        this.movieType = new NewReleaseMovieType();
        break;
      case Movie.CHILDRENS:
        this.movieType = new ChildrenMovieType();
        break;
      default:
        this.movieType = new UnKnownMovieType();
    }
  }

  public String getTitle() {
    return title;
  }

  double amount(int daysRented) {
      return movieType.amount(daysRented);
  }

  int frequentRenterPoints(int daysRented) {
    return movieType.frequentRenterPoints(daysRented);
  }
}