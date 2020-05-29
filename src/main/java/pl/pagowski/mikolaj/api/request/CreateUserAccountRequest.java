package pl.pagowski.mikolaj.api.request;

import lombok.Data;

@Data
public class CreateUserAccountRequest {

    private String userName;
    private String userSurname;
    private String email;
    private Integer age;
}
