package com.carrental.repository;
import com.carrental.model.Car;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
public class CarRepository {
    private final Map<Long, Car> database = new HashMap<>();
  public void save(Car car) { database.put(car.getId(), car); }
    public Optional<Car> findById(Long id) { return Optional.ofNullable(database.get(id)); }
    public List<Car> findAll() { return new ArrayList<>(database.values()); }}
