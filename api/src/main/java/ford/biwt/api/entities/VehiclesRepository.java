package ford.biwt.api.entities;

import java.util.List;
import java.util.UUID;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


// jpa repository needs two parameters, 
// the entity that we are going to work with
// the attribute kind of the primary key of the element

// @Repository
public interface VehiclesRepository extends JpaRepository<VehiclesEntity, UUID>{

    // @Query("SELECT * FROM vehicles")
    // List<VehiclesEntity> getVehicles();
}
