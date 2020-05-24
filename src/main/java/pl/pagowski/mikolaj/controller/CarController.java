package pl.pagowski.mikolaj.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.pagowski.mikolaj.api.request.AddCarRequest;
import pl.pagowski.mikolaj.api.response.AddCarResponse;

@RestController
@RequestMapping("car")
public class CarController {

    @PostMapping(value = "/add", produces = "application/json")
    public ResponseEntity<AddCarResponse> addCar(@RequestBody AddCarRequest request) {
        return null;
    }
}
