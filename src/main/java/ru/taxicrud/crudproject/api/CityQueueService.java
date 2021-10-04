package ru.taxicrud.crudproject.api;

import ru.taxicrud.crudproject.model.CityQueueEntity;

import java.util.Optional;

public interface CityQueueService {

    CityQueueEntity findById(Long id);

    void addCity(CityQueueEntity cityQueueEntity);

    void getCity(CityQueueEntity cityQueueEntity);

    void editCity(Long id, CityQueueEntity cityQueueEntity);

    void deleteCity(CityQueueEntity cityQueueEntity);
}

