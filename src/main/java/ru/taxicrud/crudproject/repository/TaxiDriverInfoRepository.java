package ru.taxicrud.crudproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.taxicrud.crudproject.model.TaxiDriverInfoEntity;


@Repository
public interface TaxiDriverInfoRepository extends CrudRepository<TaxiDriverInfoEntity, Long> {

}
