package com.carrental;
import com.carrental.model.*;
import com.carrental.repository.CarRepository;
import com.carrental.service.RentalService;
public class Main {
    public static void main(String[] args) {
        CarRepository repo = new CarRepository();
        RentalService service = new RentalService(repo);

        repo.save(new Car(1L, "Tesla", "Model S", 120.0));
        repo.save(new Car(2L, "BMW", "M5", 150.0));
        System.out.println("Available cars:");
        service.getAvailableCars().forEach(System.out::println);}}
