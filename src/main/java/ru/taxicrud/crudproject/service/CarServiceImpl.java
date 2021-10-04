package ru.taxicrud.crudproject.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.taxicrud.crudproject.api.CarService;
import ru.taxicrud.crudproject.model.CarEntity;
import ru.taxicrud.crudproject.repository.CarRepository;

import java.util.Optional;

@Service
@Slf4j
public class CarServiceImpl implements CarService {
    @Autowired
    private CarRepository carRepository;

    @Transactional
    public CarEntity findById(Long id){
        return carRepository.findById(id).get();
    }

    @Transactional
    public void addCar(CarEntity carEntity){
        carRepository.save(carEntity);
    }
    @Transactional
    public Iterable<CarEntity> getCar(){
         return carRepository.findAll();
    }
    @Transactional
    public void editCar(Long id, CarEntity carEntity){
        if (!carRepository.existsById(id)) {
            log.info("Car with id " + id + " not found");
        }
        else {
            CarEntity carForId = carRepository.findById(id).get();
            carForId.setModel(carEntity.getModel());
            carRepository.save(carForId);
        }
    }
    @Transactional
    public void deleteCar(Long id){
        CarEntity delete = carRepository.findById(id).get();
        carRepository.delete(delete);
    }
}
