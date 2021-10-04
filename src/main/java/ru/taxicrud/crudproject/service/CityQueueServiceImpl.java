package ru.taxicrud.crudproject.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.taxicrud.crudproject.api.CityQueueService;
import ru.taxicrud.crudproject.model.CarEntity;
import ru.taxicrud.crudproject.model.CityQueueEntity;
import ru.taxicrud.crudproject.repository.CityQueueRepository;

import java.util.Optional;

@Service
@Slf4j
public class CityQueueServiceImpl implements CityQueueService {
    @Autowired
    private CityQueueRepository cityQueueRepository;

    @Transactional
    public CityQueueEntity findById(Long id) {
        return cityQueueRepository.findById(id).get();
    }

    @Transactional
    public void addCity(CityQueueEntity cityQueueEntity) {
        cityQueueRepository.save(cityQueueEntity);
    }

    @Transactional
    public void getCity(CityQueueEntity cityQueueEntity) {
        cityQueueRepository.findAll();
    }

    @Transactional
    public void editCity(Long id, CityQueueEntity cityQueueEntity) {
        if (!cityQueueRepository.existsById(id)) {
            log.info("City with id " + id + " not found");
        }
        cityQueueRepository.save(cityQueueEntity);
    }

    @Transactional
    public void deleteCity(CityQueueEntity cityQueueEntity) {
        cityQueueRepository.delete(cityQueueEntity);
    }
}
