package ru.taxicrud.crudproject.api;

import ru.taxicrud.crudproject.model.TaxiDriverInfoEntity;

public interface TaxiDriverInfoService {

    TaxiDriverInfoEntity findById(Long id);

    void addDriver(TaxiDriverInfoEntity taxiDriverInfoEntity);

    Iterable<TaxiDriverInfoEntity> getDriver();

    void editDriver(Long id, TaxiDriverInfoEntity taxiDriverInfoEntity);

    void deleteDriver(Long id);
}
