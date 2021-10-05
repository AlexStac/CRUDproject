package ru.taxicrud.crudproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.taxicrud.crudproject.api.TaxiDriverInfoService;
import ru.taxicrud.crudproject.model.TaxiDriverInfoEntity;

@RestController
public class TaxiDriverInfoController {
    @Autowired
    private TaxiDriverInfoService taxiDriverInfoService;

    @GetMapping("/findDriver/{id}")
    public TaxiDriverInfoEntity findById(@PathVariable long id) {
        return taxiDriverInfoService.findById(id);
    }

    @PostMapping("/addDriver")
    public void addDriver(@RequestBody TaxiDriverInfoEntity taxiDriverInfoEntity){
        taxiDriverInfoService.addDriver(taxiDriverInfoEntity);
    }

    @GetMapping("/getDriver")
    public Iterable<TaxiDriverInfoEntity> getDriver(){
        return taxiDriverInfoService.getDriver();
    }

    @PostMapping("/editDriver/{id}")
    public void editDriver(@PathVariable Long id,@RequestBody TaxiDriverInfoEntity taxiDriverInfoEntity){
        taxiDriverInfoService.editDriver(id, taxiDriverInfoEntity);
    }

    @PostMapping("/deleteDriver/{id}")
    public void deleteDriver(@PathVariable Long id){
        taxiDriverInfoService.deleteDriver(id);
    }
}
