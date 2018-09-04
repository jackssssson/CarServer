package com.example.cars.servieces;

import com.example.cars.Car;

import java.util.List;

public interface CarService {
    void createCar(Car car);
    List<Car> getCars();
    Car getCarsById(int id);
    void updateCar(int id, Car car);
    void deleteCar(int id);
}
