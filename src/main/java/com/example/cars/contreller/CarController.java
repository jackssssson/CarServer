package com.example.cars.contreller;

import com.example.cars.Car;
import com.example.cars.servieces.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarController {
    private CarService service;

    @Autowired
    CarController(CarService service){
        this.service = service;
    }

    @PostMapping("/new")
    public void createStudent(@RequestBody Car car){
        service.createCar(car);
    }

    @GetMapping
    public List<Car> getCars(){
        return service.getCars();
    }

    @GetMapping("/{id}")
    public Car getCarById(@PathVariable int id){
        return service.getCarsById(id);
    }

    @PutMapping("/{id}")
    public void updateCar(@PathVariable int id, @RequestBody Car car){
        service.updateCar(id, car);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable int id){
        service.deleteCar(id);
    }
}
