package ru.taxicrud.crudproject.api;


import ru.taxicrud.crudproject.model.CarEntity;

import java.util.Optional;

public interface CarService {

    CarEntity findById(Long id);

    void addCar(CarEntity carEntity);

    Iterable<CarEntity> getCar();

    void editCar(Long id,CarEntity carEntity);

    void deleteCar(Long id);

}
