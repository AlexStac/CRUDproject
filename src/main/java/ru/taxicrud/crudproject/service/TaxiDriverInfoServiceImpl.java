package ru.taxicrud.crudproject.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.taxicrud.crudproject.api.TaxiDriverInfoService;
import ru.taxicrud.crudproject.model.CityQueueEntity;
import ru.taxicrud.crudproject.model.TaxiDriverInfoEntity;
import ru.taxicrud.crudproject.repository.TaxiDriverInfoRepository;

import java.util.Optional;

@Service
@Slf4j
public class TaxiDriverInfoServiceImpl implements TaxiDriverInfoService {
    @Autowired
    private TaxiDriverInfoRepository taxiDriverInfoRepository;

    @Transactional
    public TaxiDriverInfoEntity findById(Long id) {
        return taxiDriverInfoRepository.findById(id).get();
    }

    @Transactional
    public void addDriver(TaxiDriverInfoEntity taxiDriverInfoEntity) {
        taxiDriverInfoRepository.save(taxiDriverInfoEntity);
    }

    @Transactional
    public void getDriver(TaxiDriverInfoEntity taxiDriverInfoEntity) {
        taxiDriverInfoRepository.findAll();
    }

    @Transactional
    public void editDriver(Long id, TaxiDriverInfoEntity taxiDriverInfoEntity) {
        if (!taxiDriverInfoRepository.existsById(id)) {
            log.info("Driver with id " + id + " not found");
        }
        taxiDriverInfoRepository.save(taxiDriverInfoEntity);
    }

    @Transactional
    public void deleteDriver(TaxiDriverInfoEntity taxiDriverInfoEntity) {
        taxiDriverInfoRepository.delete(taxiDriverInfoEntity);
    }
}
