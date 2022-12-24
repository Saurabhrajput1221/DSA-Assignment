package Polymorphism;
// package com.driver;

public class Polymorphism {
  public static class Product {

    public int product(int x, int y) {
      return (x * y);
    }

    public int product(int x, int y, int z) {
      return (x * y * z);
    }

    public double product(double x, double y) {
      return (x * y);
    }
  }

  public static void main(String[] args) {
    Product P = new Product();
   
    System.out.println( P.product(4, 4));
    System.out.println( P.product(4, 4, 3));
    System.out.println( P.product(5.4,6.6));
  }
}