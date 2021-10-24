package config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
public class CustomApplicationException extends Exception {

    @Getter
    @Setter
    final HttpStatus httpStatus;

    private static final long serialVersionUID = 1L;

    public CustomApplicationException(String... exceptionMsg) {
        super(llenarMensaje(exceptionMsg));
        this.httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
    }

    public CustomApplicationException(HttpStatus status, String... exceptionMsg) {
        super(llenarMensaje(exceptionMsg));
        this.httpStatus = status;
    }

    private static String llenarMensaje(String... exceptionMsg) {
        StringBuilder sbMensaje = new StringBuilder();
        for (String data : exceptionMsg) {
            sbMensaje.append(data);
        }
        //Logs.error(sbMensaje.toString());
        return sbMensaje.toString();
    }
}
