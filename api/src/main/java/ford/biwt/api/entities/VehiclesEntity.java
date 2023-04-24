package ford.biwt.api.entities;

import java.time.Instant;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import ford.biwt.api.records.Vehicles;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="vehicles")
@Entity(name="VehiclesEntity")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VehiclesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uuid;

    // @Column(name = "created_at", columnDefinition = "TIMESTAMP DEFAULT NOW()")
    // @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "created_at")
    @CreationTimestamp
    private Instant created_at;

    private String name;

    // all the data shall be converted and sent to the database
    // the UUID and LocalDate are specific types

    public VehiclesEntity( Vehicles data){
        // this.uuid=UUID.randomUUID();
        // this.created_at=Instant.now();
        this.name=data.name();
        
    }

}
