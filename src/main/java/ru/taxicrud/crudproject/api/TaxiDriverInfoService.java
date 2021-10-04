package ru.taxicrud.crudproject.api;

import ru.taxicrud.crudproject.model.TaxiDriverInfoEntity;

import java.util.Optional;

public interface TaxiDriverInfoService {
    TaxiDriverInfoEntity findById(Long id);

    void addDriver(TaxiDriverInfoEntity taxiDriverInfoEntity);

    void getDriver(TaxiDriverInfoEntity taxiDriverInfoEntity);

    void editDriver(Long id, TaxiDriverInfoEntity taxiDriverInfoEntity);

    void deleteDriver(TaxiDriverInfoEntity taxiDriverInfoEntity);
}
