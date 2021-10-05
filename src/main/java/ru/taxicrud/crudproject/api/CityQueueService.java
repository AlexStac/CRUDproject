package ru.taxicrud.crudproject.api;

import ru.taxicrud.crudproject.model.CityQueueEntity;

public interface CityQueueService {

    CityQueueEntity findById(Long id);

    void addCity(CityQueueEntity cityQueueEntity);

    Iterable<CityQueueEntity> getCity();

    void editCity(Long id, CityQueueEntity cityQueueEntity);

    void deleteCity(Long id);
}

