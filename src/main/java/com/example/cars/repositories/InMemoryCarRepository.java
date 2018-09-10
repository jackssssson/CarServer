package com.example.cars.repositories;

import com.example.cars.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryCarRepository implements CarRepository {
    private List<Car> cars;

    InMemoryCarRepository() {
        cars = new ArrayList<>();
        addCars();
    }

    @Override
    public void createCar(Car car) {
        cars.add(car);
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }

    @Override
    public Car getCarsById(int id) {
        return getCar(id);
    }

    @Override
    public void updateCar(int id, Car car) {
        Car c = getCar(id);
        int index = cars.indexOf(c);
        cars.set(index, car);
    }

    @Override
    public void deleteCar(int id) {
        Car car = getCar(id);
        cars.remove(car);
    }

    private Car getCar(int id) {
        return cars.stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .orElse(null);
    }

    private void addCars() {
        cars.add(new Car(1, "Alfa Romeo", 2000, "Red"));
        cars.add(new Car(2, "Mercedes", 2005, "Black"));
        cars.add(new Car(3, "Opel", 1990, "White"));
        cars.add(new Car(4, "Ferrari", 2015, "Red"));
        cars.add(new Car(5, "Maserati", 2010, "Green"));
        cars.add(new Car(6, "Audi", 2018, "Blue"));
        cars.add(new Car(7,"Bmw",2008,"Grey"));
        cars.add(new Car(8,"Renault", 2007,"Yellow"));
    }
}
