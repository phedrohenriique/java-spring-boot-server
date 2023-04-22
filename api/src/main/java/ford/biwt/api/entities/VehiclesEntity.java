package ford.biwt.api.entities;

import java.security.Timestamp;
import java.sql.Date;
import java.time.LocalDate;
import java.util.UUID;

import ford.biwt.api.records.Vehicles;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name="vehicles")
@Entity(name="VehiclesEntity")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class VehiclesEntity {

    @Id
    private UUID uuid;
    private LocalDate created_at;
    private String name;

    public VehiclesEntity( Vehicles data){
        this.uuid=UUID.randomUUID();
        this.created_at=LocalDate.now();
        this.name=data.name();
        System.out.println("Data : ");
        System.out.println(this.uuid);
        System.out.println(this.created_at);
        System.out.println(this.name);
        
    }

}
