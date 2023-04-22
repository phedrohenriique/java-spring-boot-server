package ford.biwt.api.entities;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;


// jpa repository needs two parameters, 
// the entity that we are going to work with
// the attribute kind of the primary key of the element

public interface VehiclesRepository extends JpaRepository<VehiclesEntity, UUID>{
    
}
