package ru.taxicrud.crudproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.taxicrud.crudproject.api.CarService;
import ru.taxicrud.crudproject.model.CarEntity;

@RestController
public class CarController {
    @Autowired
    private CarService carService;


    @GetMapping("/findCar/{id}")
    public CarEntity findById(@PathVariable long id){
        return carService.findById(id);
    }


    @PostMapping("/addCar")
    public void addCar(@RequestBody CarEntity carEntity){
        carService.addCar(carEntity);
    }

    @GetMapping("/getCars")
    public Iterable<CarEntity> getCar(){
        return carService.getCar();
    }

    @PostMapping("/editCar/{id}")
    public void deleteCar(@PathVariable long id,@RequestBody CarEntity carEntity){
        carService.editCar(id, carEntity);
    }


    @PostMapping("/deleteCar/{id}")
    public void getCarModel(@PathVariable long id){
        carService.deleteCar(id);
    }
}

