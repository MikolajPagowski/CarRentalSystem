package pl.pagowski.mikolaj.api.request;

import lombok.Data;
import pl.pagowski.mikolaj.model.CarClass;

@Data
public class AddCarRequest {

    private String brand;
    private CarClass carClass;
    private double rentalPrice;
    private Long parkingSpaceId;

}
