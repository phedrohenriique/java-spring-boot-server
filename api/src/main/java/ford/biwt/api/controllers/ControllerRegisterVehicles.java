package ford.biwt.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ford.biwt.api.entities.VehiclesEntity;
import ford.biwt.api.entities.VehiclesRepository;
import ford.biwt.api.records.Vehicles;
import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/vehicles")
public class ControllerRegisterVehicles {
    
    @Autowired
    private VehiclesRepository repository;

    @PostMapping
    @Transactional
    public void RegisterVehicles(@RequestBody Vehicles json){
        System.out.println(json);
        // repository.save(new VehiclesEntity(null, null, json.name()));
        repository.save(new VehiclesEntity(json));
    }

    // if not using sprin-boot
    // json objects shall be referenced with class
    // java doesnt have objects or dictionaries
    // but it does have hashmaps
    
    // class Vehicles {
    //     String name;
    //     public Vehicles(String name){
    //         this.name = name;
    //     }
    // }
}
