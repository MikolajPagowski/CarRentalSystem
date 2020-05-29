package pl.pagowski.mikolaj.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.pagowski.mikolaj.model.Car;

import java.util.Set;

@RestController
@RequestMapping("parkingSpace")
public class ParkingSpaceController {
    @GetMapping(value = "/{parkingSpaceId}/cars", produces = "application/json")
    public ResponseEntity<Set<Car>> rechargeUserAccount(@PathVariable Long parkingSpaceId) {

        return null;
    }
}
