package ru.taxicrud.crudproject.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.taxicrud.crudproject.api.CityQueueService;
import ru.taxicrud.crudproject.model.CityQueueEntity;
import ru.taxicrud.crudproject.repository.CityQueueRepository;


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
    public Iterable<CityQueueEntity> getCity(){
        return cityQueueRepository.findAll();
    }

    @Transactional
    public void editCity(Long id, CityQueueEntity cityQueueEntity) {
        if (!cityQueueRepository.existsById(id)) {
            log.info("City with id " + id + " not found");
        } else {
            CityQueueEntity cityForId = cityQueueRepository.findById(id).get();
            cityForId.setName(cityQueueEntity.getName());
            cityForId.setQueue(cityQueueEntity.getQueue());
            cityQueueRepository.save(cityForId);
        }
    }

    @Transactional
    public void deleteCity(Long id) {
        CityQueueEntity delCity = cityQueueRepository.findById(id).get();
        cityQueueRepository.delete(delCity);
    }
}
