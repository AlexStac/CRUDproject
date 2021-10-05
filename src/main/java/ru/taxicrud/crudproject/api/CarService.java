package ru.taxicrud.crudproject.api;

import ru.taxicrud.crudproject.model.CarEntity;

public interface CarService {

    CarEntity findById(Long id);

    void addCar(CarEntity carEntity);

    Iterable<CarEntity> getCar();

    void editCar(Long id, CarEntity carEntity);

    void deleteCar(Long id);

}
