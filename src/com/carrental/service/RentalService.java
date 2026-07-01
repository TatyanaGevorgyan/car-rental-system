package com.carrental.service;
import com.carrental.model.*;
import com.carrental.repository.CarRepository;
import java.util.List;
import java.util.stream.Collectors;
public class RentalService {
    private final CarRepository carRepository;
    private long receiptIdCounter = 1;

  public RentalService(CarRepository carRepository) { this.carRepository = carRepository; }

    public List<Car> getAvailableCars() {
        return carRepository.findAll().stream().filter(Car::isAvailable).collect(Collectors.toList());
    }

    public RentalReceipt rentCar(Long carId, Customer customer, int days) {
        Car car = carRepository.findById(carId).orElseThrow(() -> new IllegalArgumentException("the Car hasn't found"));
        if (!car.isAvailable()) throw new IllegalStateException("Car isn't available");
        car.setAvailable(false);
        carRepository.save(car);
        return new RentalReceipt(receiptIdCounter++, car, customer, days);}}
