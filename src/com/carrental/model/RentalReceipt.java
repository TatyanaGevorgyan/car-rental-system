package com.carrental.model;
public class RentalReceipt {
    private Long id;
    private Car car;
    private Customer customer;
    private int rentalDays;
    private double totalPrice;
 public RentalReceipt(Long id, Car car, Customer customer, int rentalDays) {
        this.id = id;
        this.car = car;
        this.customer = customer;
        this.rentalDays = rentalDays;
        this.totalPrice = car.getPricePerDay() * rentalDays;   }
@Override
    public String toString() {
        return String.format("--- Receipt  №%d ---\nClient: %s\nCar: %s %s\nDays: %d\nPrice: $%.2f", 
                id, customer.getFullName(), car.getBrand(), car.getModel(), rentalDays, totalPrice);}}
