package com.example.cars.servieces;

import com.example.cars.Car;
import com.example.cars.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CarServiceImpl implements CarService {
    private CarRepository repository;

    @Autowired
    CarServiceImpl(CarRepository repository){
        this.repository = repository;
    }

    @Override
    public void createCar(Car car) {
        repository.createCar(car);
    }

    @Override
    public List<Car> getCars() {
        return repository.getCars();
    }

    @Override
    public Car getCarsById(int id) {
        return repository.getCarsById(id);
    }

    @Override
    public void updateCar(int id, Car car) {
        repository.updateCar(id, car);
    }

    @Override
    public void deleteCar(int id) {
        repository.deleteCar(id);
    }
}
