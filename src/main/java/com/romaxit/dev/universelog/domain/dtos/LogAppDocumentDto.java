package com.romaxit.dev.universelog.domain.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.internal.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Getter
@Setter
public class LogAppDocumentDto {

        private static final long serialVersionUID = -7788619177798333712L;

        private String id;

        @NotNull
        @NotEmpty(message = "El campo es obligatorio")
        private String app;

        @NotNull
        @NotEmpty(message = "El campo es obligatorio")
        private String microservicio;

        @NotNull
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss", timezone = "GMT-5")
        private Date fecha;

        @NotNull
        @NotEmpty(message = "El campo es obligatorio")
        private String clase;

        private String metodo;

        private String negocio;

        private String referenciaLineaCodigo;

        private String parametros;

        private String otrosParametros;

        private String status;

        @NotEmpty(message = "El campo es obligatorio")
        private String mensaje;

        private String excepcion;

        private String user;

        private String ip;

    }
