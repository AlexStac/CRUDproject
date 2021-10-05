package ru.taxicrud.crudproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.taxicrud.crudproject.api.CityQueueService;
import ru.taxicrud.crudproject.model.CityQueueEntity;

@RestController
public class CityQueueController {
    @Autowired
    private CityQueueService cityQueueService;

    @GetMapping("/findCity/{id}")
    public CityQueueEntity findById(@PathVariable long id) {
        return cityQueueService.findById(id);
    }

    @PostMapping("/addCity")
    public void addCity(@RequestBody CityQueueEntity cityQueueEntity){
        cityQueueService.addCity(cityQueueEntity);
    }

    @GetMapping("/getCity")
    public Iterable<CityQueueEntity> getCity(){
        return cityQueueService.getCity();
    }

    @PostMapping("/editCity/{id}")
    public void editCity(@PathVariable long id,@RequestBody CityQueueEntity cityQueueEntity){
        cityQueueService.editCity(id, cityQueueEntity);
    }

    @PostMapping("/deleteCity/{id}")
    public void deleteCity(@PathVariable long id){
        cityQueueService.deleteCity(id);
    }
}