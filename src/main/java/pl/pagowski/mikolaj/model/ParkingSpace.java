package pl.pagowski.mikolaj.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class ParkingSpace {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private Integer avaliablePlace;

    @OneToMany(mappedBy = "parkingSpace", cascade = CascadeType.ALL)
    private Set<Car> cars;

}
