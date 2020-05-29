package pl.pagowski.mikolaj.api.response;

import lombok.Data;

@Data
public class CreateUserAccountResponse extends BasicResponse {
    private Long accountId;

    public CreateUserAccountResponse() {
    }

    public CreateUserAccountResponse(String responseMessage, Long accountId) {
        super(responseMessage);
        this.accountId = accountId;
    }
}
