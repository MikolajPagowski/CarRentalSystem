package pl.pagowski.mikolaj.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pagowski.mikolaj.api.response.BasicResponse;

@RestController
@RequestMapping("rental")
public class RentalController {

    @PutMapping(value = "/{carId}/car", produces = "application/json")
    public ResponseEntity<BasicResponse> createUserAccount(@PathVariable Long carId, @RequestParam Long accountId) {

        return null;
    }
}
