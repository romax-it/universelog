package com.romaxit.dev.universelog.domain.documents;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.internal.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.Date;

@Document(collection = "log_apps")
@Getter
@Setter
public class LogAppDocument implements Serializable {

    private static final long serialVersionUID = -7788619177798333712L;

    @Id
    private String id;

    @NotNull
    @Field("app")
    private String app;

    @NotNull
    private String microservicio;

    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss", timezone = "GMT-5")
    private Date fecha;

    @NotNull
    private String clase;

    private String metodo;

    private String negocio;

    @Field("ref_linea_codigo")
    private String referenciaLineaCodigo;

    private String parametros;

    @Field("otros_parametros")
    private String otrosParametros;

    private String status;

    @NotNull
    private String mensaje;

    private String excepcion;

    private String user;

    private String ip;

}