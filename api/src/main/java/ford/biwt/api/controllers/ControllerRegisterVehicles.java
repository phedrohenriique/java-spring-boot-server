package ford.biwt.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ford.biwt.api.entities.VehiclesEntity;
import ford.biwt.api.entities.VehiclesRepository;
import ford.biwt.api.records.Vehicles;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import lombok.val;

@RestController
@RequestMapping("/vehicles")
public class ControllerRegisterVehicles {

    // public record Response(String message, Number status) {
    // };
    
    // using the repository as a class to be used and
    // access database through it

    @Autowired
    private VehiclesRepository repository;

    // request decorator says it comes from the request body
    // valid checks for the bean validation module decorators
    // transactional awaits insertion and data transition in database

    @GetMapping
    public List<VehiclesEntity> ListVehicles(){
        return repository.findAll();
    }

    @PostMapping
    @Transactional
    public void RegisterVehicles(@RequestBody @Valid Vehicles json){
        repository.save( new VehiclesEntity(json));
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
