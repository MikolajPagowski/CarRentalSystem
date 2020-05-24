package pl.pagowski.mikolaj.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pagowski.mikolaj.api.response.BasicResponse;
import pl.pagowski.mikolaj.api.request.CreateUserAccountRequest;
import pl.pagowski.mikolaj.api.response.CreateUserAccountResponse;

@RestController
@RequestMapping("user-account")
public class UserAccountController {

    @PostMapping(value = "/create", produces = "application/json")
    public ResponseEntity<CreateUserAccountResponse> createUserAccount(@RequestBody CreateUserAccountRequest request) {
        return null;
    }

    @PutMapping(value = "/{accountId}/recharge", produces = "application/json")
    public ResponseEntity<BasicResponse> rechargeUserAccount(@PathVariable Long accountId, @RequestParam String amount) {
        return null;
    }

}
