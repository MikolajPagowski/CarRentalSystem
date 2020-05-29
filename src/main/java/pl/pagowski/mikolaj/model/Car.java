package pl.pagowski.mikolaj.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String brand;
    private String model;
    private CarClass carClass;
    private BigDecimal rentalPrice;

    @JsonIgnore
    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "parking_space_id")
    private ParkingSpace parkingSpace;

    @JsonIgnore
    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "user_account_id", referencedColumnName = "id")
    private UserAccount userAccount;


}
