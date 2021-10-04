package ru.taxicrud.crudproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.taxicrud.crudproject.model.CityQueueEntity;

@Repository
public interface CityQueueRepository extends CrudRepository<CityQueueEntity, Long> {

}
