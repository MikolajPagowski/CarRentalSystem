package pl.pagowski.mikolaj.api.response;

import lombok.Data;

@Data
public class AddCarResponse extends BasicResponse {
    private Long carId;

    public AddCarResponse(String responseMessage, Long carId) {
        super(responseMessage);
        this.carId = carId;
    }

}
