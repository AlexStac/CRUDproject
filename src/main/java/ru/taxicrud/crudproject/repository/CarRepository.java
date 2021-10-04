package ru.taxicrud.crudproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.taxicrud.crudproject.model.CarEntity;

@Repository
public interface CarRepository extends CrudRepository<CarEntity, Long> {
}
