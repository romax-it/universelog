package com.romaxit.dev.universelog.domain.dtos.config;

import config.UniverseUtils;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.io.Serializable;

@Getter
@Setter
public class ResponseCustomErrorDto implements Serializable {

    private static final long serialVersionUID = 1905122041950251207L;
    private String message = "null";
    private String excepcion = "null";
    private String timestamp;
    private int status;

    public ResponseCustomErrorDto(String mensaje, int status, String error) {
        this.message = mensaje;
        this.status =  status;
        this.excepcion  = error;
        this.timestamp = UniverseUtils.obtenerCadenaFechaActual();
    }

    public ResponseCustomErrorDto(HttpStatus status) {
        this.status =  status.value();
        this.timestamp = UniverseUtils.obtenerCadenaFechaActual();
    }

    public void setAnalizerMessagesMask() {
        if(this.getMessage() == null){
            this.setMessage("Error interno por un valor nulo");
        } else{
            if(this.getMessage().contains("permission denied")){
                this.setMessage("Error interno por falta de permisos sobre un objeto de base de datos");
            }
        }
    }
}

