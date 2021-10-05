package ru.taxicrud.crudproject.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.taxicrud.crudproject.api.TaxiDriverInfoService;
import ru.taxicrud.crudproject.model.TaxiDriverInfoEntity;
import ru.taxicrud.crudproject.repository.TaxiDriverInfoRepository;


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
    public Iterable<TaxiDriverInfoEntity> getDriver() {
        return taxiDriverInfoRepository.findAll();
    }

    @Transactional
    public void editDriver(Long id, TaxiDriverInfoEntity taxiDriverInfoEntity) {
        if (!taxiDriverInfoRepository.existsById(id)) {
            log.info("Driver with id " + id + " not found");
        } else {
            TaxiDriverInfoEntity driverForId = taxiDriverInfoRepository.findById(id).get();
            driverForId.setLastName(taxiDriverInfoEntity.getLastName());
            driverForId.setFirstName(taxiDriverInfoEntity.getFirstName());
            driverForId.setLevel(taxiDriverInfoEntity.getLevel());
            driverForId.setCarModel(taxiDriverInfoEntity.getCarModel());
            taxiDriverInfoRepository.save(driverForId);
        }
    }

    @Transactional
    public void deleteDriver(Long id) {
        TaxiDriverInfoEntity delDriver = taxiDriverInfoRepository.findById(id).get();
        taxiDriverInfoRepository.delete(delDriver);
    }
}
