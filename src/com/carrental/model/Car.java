package com.carrental.model;
public class Car {
    private Long id;
    private String brand;
    private String model;
    private double pricePerDay;
    private boolean isAvailable;
  public Car(Long id, String brand, String model, double pricePerDay) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.pricePerDay = pricePerDay;
        this.isAvailable = true;
    }
 public Long getId() { return id; }
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public double getPricePerDay() { return pricePerDay; }
    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { this.isAvailable = available; }

 @Override
    public String toString() {
        return String.format("ID: %d | %s %s | $%.2f/day | is Available: %s", 
                id, brand, model, pricePerDay, isAvailable ? "Yes" : "NO");}}
