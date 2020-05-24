package pl.pagowski.mikolaj.api.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import pl.pagowski.mikolaj.api.type.ResponseStatus;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BasicResponse {
    private String responseMessage;
    private String errorCode;
    private String errorMessage;
    private ResponseStatus status;

    public BasicResponse() {

    }

    // set success response
    public BasicResponse(String responseMessage) {
        this.responseMessage = responseMessage;
        this.status = ResponseStatus.SUCCESS;
    }

    // set error response
    public BasicResponse(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.status = ResponseStatus.ERROR;
    }

    public static BasicResponse of(String responseMessage) {
        return new BasicResponse(responseMessage);
    }

    public static BasicResponse ofError(String errorCode, String errorMessage) {
        return new BasicResponse(errorCode, errorMessage);
    }

}
