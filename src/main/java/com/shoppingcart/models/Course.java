package com.shoppingcart.models;

public class Course {
  private int id;
  private String name;
  private double price; 
  private double rate;
  private String author;
  private String image;

  public Course() {
  }

  public Course(int id, String name, double price, double rate, String author, String image) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.rate = rate;
    this.author = author;
    this.image = image;
  }

  @Override
  public String toString() {
    return "{" +
      " id='" + id + "'" +
      ", name='" + name + "'" +
      ", price='" + price + "'" +
      ", rate='" + rate + "'" +
      ", author='" + author + "'" +
      ", image='" + image + "'" +
      "}";
  }


}
